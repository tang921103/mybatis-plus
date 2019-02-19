package com.zsm.generate;

import com.zsm.generate.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GenerateApplicationTests {
    @Resource
    private UserMapper userMapper;
    @Test
    public void contextLoads() {
    }
    @Test
    public void test1(){
        System.out.println(userMapper.selectList(null));
    }
}
