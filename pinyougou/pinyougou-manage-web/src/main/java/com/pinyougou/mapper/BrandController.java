package com.pinyougou.mapper;


import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.mapper.sellergoods.service.BrandService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/brand")
//@Controller
@RestController //@ResponseBody+@Controller
public class BrandController {

    //引入远程的服务对象
    @Reference
    private BrandService brandService;

    /**
     *  查询所有品牌数据
     *  @return 返回品牌列表json格式字符串
     */
    /*@RequestMapping(value = "findAll",method = RequestMethod.GET)
    @ResponseBody*/
    @GetMapping("/findAll")
    public List<TbBrand> findAll(){

        return brandService.queryAll();
    }
}
