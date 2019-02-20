package com.zsm.core;

import com.baomidou.mybatisplus.core.conditions.interfaces.Func;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zsm.core.entity.FuncEntity;
import com.zsm.core.entity.User;
import com.zsm.core.entity.UserEntity;
import com.zsm.core.mapper.FuncMapper;
import com.zsm.core.mapper.UserMapper;
import com.zsm.core.service.FuncService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoreApplicationTests {
    @Resource
    private UserMapper userMapper;
    @Resource
    private FuncService funcServiceImpl;
    @Test
    public void contextLoads() {
    }
    @Test
    public void test1(){
        List<UserEntity> list = userMapper.selectList(null);
        for(UserEntity user:list){
            System.out.println(user);
        }
    }

    /**
     * service层接口测试
     * save update
     */
    @Test
    public void serviceSaveTest(){
        //构造器
        QueryWrapper<FuncEntity> queryWrapper = new QueryWrapper<FuncEntity>();
        FuncEntity entity = new FuncEntity();
        entity.setFuncName("用户组");
        entity.setFuncPrivilege("GET:list");
//        funcServiceImpl.save(entity);
        entity.setFuncCreateTime(LocalDateTime.now());
//        entity.setId(126);
//        funcServiceImpl.saveOrUpdate(entity);
        List<FuncEntity> c = new ArrayList<>();
        FuncEntity entity1 = new FuncEntity();
        entity.setFuncName("权限");
        c.add(entity);
        c.add(entity1);
        funcServiceImpl.saveBatch(c);
    }

    /**
     * remove测试
     */
    @Test
    public void removeTest(){
//        funcServiceImpl.removeById(128);
        List<Integer> list = new ArrayList<Integer>();
        list.add(126);
        list.add(127);
//        funcServiceImpl.removeByIds(list);
        Map<String,Object> map = new HashMap<>();
        //列名
        map.put("dc_func_name","权限");
        funcServiceImpl.removeByMap(map);
    }

    /**
     * 查询
     * get
     * list
     */
    @Test
    public void getAndListTest(){
        Map<String,Object> map = new HashMap<>();
        //列名
        map.put("dc_func_name","权限");
//        FuncEntity entity = funcServiceImpl.getById(125);
        QueryWrapper<FuncEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("dc_func_name","用户组");
        Map<String,Object> map1 = funcServiceImpl.getMap(queryWrapper);
        System.out.println(map1);
//        System.out.println(entity);
    }
}
