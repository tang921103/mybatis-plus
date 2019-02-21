package com.zsm.validate.controller;


import com.zsm.validate.entity.UserEntity;
import com.zsm.validate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author 唐秋
 * @since 2019-02-21
 */
@RestController
@RequestMapping("/user")
@Validated
public class UserController {
    @Resource
    private UserService userServiceImpl;
    @RequestMapping("/findAll")
    public Object findAll(@Valid UserEntity entity,@NotBlank(message = "卡号") String card){
        return userServiceImpl.list();
    }
}

