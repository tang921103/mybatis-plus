package com.zsm.core.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zsm.core.entity.FuncEntity;
import com.zsm.core.mapper.FuncMapper;
import com.zsm.core.service.FuncService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 功能菜单表 服务实现类
 * </p>
 *
 * @author 唐秋
 * @since 2019-02-20
 */
@Service
@DS("master")
public class FuncServiceImpl extends ServiceImpl<FuncMapper, FuncEntity> implements FuncService {

}
