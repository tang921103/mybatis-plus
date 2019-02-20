package com.zsm.core.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zsm.core.entity.UserEntity;
import com.zsm.core.service.UserService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author 唐秋
 * @since 2019-02-20
 */
@Controller
@RequestMapping("/user")
@Validated
public class UserController {
    @Resource
    private UserService userServiceImpl;
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello world";
    }
    @RequestMapping("/findAll")
    @ResponseBody
    public Object findAll(){
        QueryWrapper<UserEntity> queryWrapper = new QueryWrapper<>();
        List<UserEntity> list = userServiceImpl.list(queryWrapper);
        return list;
    }
}

