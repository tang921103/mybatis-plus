package com.zsm.core.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 功能菜单表
 * </p>
 *
 * @author 唐秋
 * @since 2019-02-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("dc_func")
@ApiModel(value="FuncEntity对象", description="功能菜单表")
public class FuncEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "功能菜单名称")
    @TableField("dc_func_name")
    private String funcName;

    @ApiModelProperty(value = "父ID")
    @TableField("dc_func_pid")
    private Integer funcPid;

    @ApiModelProperty(value = "功能菜单的URL")
    @TableField("dc_func_url")
    private String funcUrl;

    @TableField("dc_func_create_time")
    private LocalDateTime funcCreateTime;

    @TableField("dc_func_creator")
    private String funcCreator;

    @TableField("dc_func_update_time")
    private LocalDateTime funcUpdateTime;

    @TableField("dc_func_updator")
    private String funcUpdator;

    @ApiModelProperty(value = "删除标志，0正常1已删除")
    @TableField("dc_func_delete")
    private Integer funcDelete;

    @ApiModelProperty(value = "0 功能菜单 1按钮")
    @TableField("dc_func_type")
    private Integer funcType;

    @ApiModelProperty(value = "表单图标 ")
    @TableField("dc_func_font_awesome")
    private String funcFontAwesome;

    @ApiModelProperty(value = "显示的排序 默认升序")
    @TableField("dc_func_sort")
    private Integer funcSort;

    @ApiModelProperty(value = "权限标识\n")
    @TableField("dc_func_privilege")
    private String funcPrivilege;


}
