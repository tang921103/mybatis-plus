package com.zsm.core.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zsm.core.entity.FuncEntity;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 功能菜单表 Mapper 接口
 * </p>
 *
 * @author 唐秋
 * @since 2019-02-20
 */
public interface FuncMapper extends BaseMapper<FuncEntity> {
    @Select("select * from dc_func where id <10")
    List<FuncEntity> getAll(QueryWrapper<FuncEntity> entityQueryWrapper);
    int deleteById(int id);
}
