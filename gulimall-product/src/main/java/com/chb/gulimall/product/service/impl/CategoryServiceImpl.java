package com.chb.gulimall.product.service.impl;

import com.chb.gulimallcommon.utils.PageUtils;
import com.chb.gulimallcommon.utils.Query;
import com.chb.gulimallcommon.utils.R;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.chb.gulimall.product.dao.CategoryDao;
import com.chb.gulimall.product.entity.CategoryEntity;
import com.chb.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //获取所有分类
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        //找到父类
        List<CategoryEntity> level1Menus = categoryEntities.stream()
                .filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .map((menu)->{
                    // 设置一级分类的子分类
                    menu.setChildren(getChildren(menu, categoryEntities));
                    return menu;
                }).sorted((menu1, menu2) -> {
                    //排序
                    return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
                })
                .collect(Collectors.toList());


        return level1Menus;
    }

    @Override
    public R removeMenuByIds(List<Long> list) {
        int i = baseMapper.deleteBatchIds(list);
        if (i>0){
            return R.ok();
        }
        return R.error();
    }

    /**
     * 找到子类
     *
     */
    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {

        return all.stream().filter(new Predicate<CategoryEntity>() {
            @Override
            public boolean test(CategoryEntity categoryEntity) {
                return categoryEntity.getParentCid().equals(root.getCatId());
            }
        }).map(new Function<CategoryEntity, CategoryEntity>() {
            @Override
            public CategoryEntity apply(CategoryEntity categoryEntity) {
                 categoryEntity.setChildren(getChildren(categoryEntity,all));
                 return categoryEntity;
            }
        }).sorted(new Comparator<CategoryEntity>() {
            @Override
            public int compare(CategoryEntity o1, CategoryEntity o2) {
                return (o1.getSort()!=null?o1.getSort():0)-(o2.getSort()!=null?o2.getSort():0);
            }
        }).collect(Collectors.toList());

    }

}