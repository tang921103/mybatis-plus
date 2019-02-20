package com.zsm.core.service.impl;

import com.zsm.core.entity.UserEntity;
import com.zsm.core.mapper.UserMapper;
import com.zsm.core.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author 唐秋
 * @since 2019-02-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

}
