package com.chb.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chb.gulimall.product.dao.SpuCommentDao;
import com.chb.gulimall.product.entity.SpuCommentEntity;
import com.chb.gulimall.product.service.SpuCommentService;
import com.chb.gulimallcommon.utils.PageUtils;
import com.chb.gulimallcommon.utils.Query;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("spuCommentService")
public class SpuCommentServiceImpl extends ServiceImpl<SpuCommentDao, SpuCommentEntity> implements SpuCommentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuCommentEntity> page = this.page(
                new Query<SpuCommentEntity>().getPage(params),
                new QueryWrapper<SpuCommentEntity>()
        );

        return new PageUtils(page);
    }

}