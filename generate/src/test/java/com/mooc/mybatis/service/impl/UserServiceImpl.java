package com.mooc.mybatis.service.impl;

import com.mooc.mybatis.entity.UserEntity;
import com.mooc.mybatis.mapper.UserMapper;
import com.mooc.mybatis.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author 唐秋
 * @since 2019-07-28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

}
