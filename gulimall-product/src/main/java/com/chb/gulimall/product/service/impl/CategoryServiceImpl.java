package com.chb.gulimall.product.service.impl;

import com.chb.gulimallcommon.utils.PageUtils;
import com.chb.gulimallcommon.utils.Query;
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
        List<CategoryEntity> parentEntity = categoryEntities.stream().filter(new Predicate<CategoryEntity>() {
            @Override
            public boolean test(CategoryEntity categoryEntity) {
                return categoryEntity.getParentCid() == 0;
            }
        }).map(categoryEntity -> {
            categoryEntity.setChildren(getSubclass(categoryEntity, categoryEntities));
            return categoryEntity;
        }).sorted(new Comparator<CategoryEntity>() {
            @Override
            public int compare(CategoryEntity o1, CategoryEntity o2) {
                return (o1.getSort() == null ? 0 : o1.getSort()) - (o2.getSort() == null ? 0 : o2.getSort());
            }
        }).collect(Collectors.toList());
        //拼接子类

        return parentEntity;
    }

    /**
     * 找到子类
     *
     * @param parentEntity
     * @param categoryEntities
     * @return
     */
    private List<CategoryEntity> getSubclass(CategoryEntity parentEntity, List<CategoryEntity> categoryEntities) {

        List<CategoryEntity> collect = categoryEntities.stream().filter(new Predicate<CategoryEntity>() {
            @Override
            public boolean test(CategoryEntity categoryEntity) {
                return categoryEntity.getParentCid() == parentEntity.getCatId();
            }
        }).map(categoryEntity -> {
            parentEntity.setChildren(getSubclass(categoryEntity, categoryEntities));
            return categoryEntity;
        }).sorted(new Comparator<CategoryEntity>() {
            @Override
            public int compare(CategoryEntity o1, CategoryEntity o2) {
                return (o1.getSort() == null ? 0 : o1.getSort()) - (o2.getSort() == null ? 0 : o2.getSort());
            }
        }).collect(Collectors.toList());
        return collect;
    }

}