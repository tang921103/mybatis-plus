package com.mooc.mybatis.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author 唐秋
 * @since 2019-07-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("dc_user")
@ApiModel(value="UserEntity对象", description="用户表")
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "真实姓名")
    @TableField("dc_user_name")
    private String userName;

    @ApiModelProperty(value = "手机号")
    @TableField("dc_user_mobile")
    private String userMobile;

    @ApiModelProperty(value = "登录密码")
    @TableField("dc_user_login_password")
    private String userLoginPassword;

    @ApiModelProperty(value = "所属门店")
    @TableField("dc_user_of_store")
    private String userOfStore;

    @ApiModelProperty(value = "头像")
    @TableField("dc_user_head_photo")
    private String userHeadPhoto;

    @TableField("dc_user_create_time")
    private LocalDateTime userCreateTime;

    @TableField("dc_user_update_time")
    private LocalDateTime userUpdateTime;

    @TableField("dc_user_creator")
    private String userCreator;

    @TableField("dc_user_updator")
    private String userUpdator;

    @ApiModelProperty(value = "删除标志，0正常1已删除")
    @TableField("dc_user_delete")
    private Integer userDelete;

    @ApiModelProperty(value = "门店编号 ")
    @TableField("dc_user_of_store_id")
    private Integer userOfStoreId;

    @ApiModelProperty(value = "连锁编号")
    @TableField("dc_user_of_chain_id")
    private Integer userOfChainId;

    @ApiModelProperty(value = "连锁名称")
    @TableField("dc_user_of_chain")
    private String userOfChain;

    @ApiModelProperty(value = "用户的角色编号")
    @TableField("dc_user_of_role_id")
    private Integer userOfRoleId;

    @ApiModelProperty(value = "用户的角色名称")
    @TableField("dc_user_of_role_name")
    private String userOfRoleName;

    @ApiModelProperty(value = "用户拥有的菜单及操作权限")
    @TableField("dc_user_of_fun")
    private String userOfFun;

    @ApiModelProperty(value = "账号所属省份")
    @TableField("dc_user_of_province")
    private String userOfProvince;

    @ApiModelProperty(value = "账号所属城市
")
    @TableField("dc_user_of_city")
    private String userOfCity;

    @ApiModelProperty(value = "账号所属地区
")
    @TableField("dc_user_of_area")
    private String userOfArea;


}
