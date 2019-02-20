package com.zsm.core;

import com.zsm.core.entity.User;
import com.zsm.core.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoreApplicationTests {
    @Resource
    private UserMapper userMapper;
    @Test
    public void contextLoads() {
    }
    @Test
    public void test1(){
        List<User> list = userMapper.selectList(null);
        for(User user:list){
            System.out.println(user);
        }
    }
}
