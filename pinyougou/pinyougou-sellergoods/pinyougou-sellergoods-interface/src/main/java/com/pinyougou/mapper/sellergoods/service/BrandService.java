package com.pinyougou.mapper.sellergoods.service;

import com.pinyougou.pojo.TbBrand;

import java.util.List;

public interface BrandService {
    /**
     *  查询所有品牌数据
     *  @return 返回品牌列表
     */
    List<TbBrand> queryAll();
}
