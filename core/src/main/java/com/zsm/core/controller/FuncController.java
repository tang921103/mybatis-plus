package com.zsm.core.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zsm.core.entity.FuncEntity;
import com.zsm.core.service.FuncService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 功能菜单表 前端控制器
 * </p>
 *
 * @author 唐秋
 * @since 2019-02-20
 */
@RestController
@RequestMapping("/func")
public class FuncController {
    @Autowired
    private FuncService funcService;
    @RequestMapping("/find")
    public Object find(FuncEntity entity){
        List<FuncEntity> list = funcService.list();
        return list;
    }

    /**
     * 分页
     * @param page
     * @param entity
     * @return
     */
    @ApiOperation(value = "分页查询菜单")
    @RequestMapping("/findAll")
    public IPage<FuncEntity> page(Page<FuncEntity> page,FuncEntity entity){
        QueryWrapper<FuncEntity> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq("dc_func_name","数据管理");
        queryWrapper.eq("dc_func_name","数据管理");
        IPage<FuncEntity> list = funcService.page(page,queryWrapper);
        return  list;
    }
}

