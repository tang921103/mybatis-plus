package com.zsm.validate.service.impl;

import com.zsm.validate.entity.UserEntity;
import com.zsm.validate.mapper.UserMapper;
import com.zsm.validate.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author 唐秋
 * @since 2019-02-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

}
