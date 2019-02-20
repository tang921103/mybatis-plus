package com.zsm.generate;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
//@MapperScan(basePackages = {"com.zsm.core.mapper"})
public class GenerateApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenerateApplication.class, args);
        generate();
    }

    /**
     * 代码生成
     */
    public static void generate(){
        System.out.println("+++++++++++++");
//        System.setProperty("user.dir","core");
        String dir = System.getProperty("user.dir");
        System.out.println(dir);
        //代码生成器
        AutoGenerator autoGenerator = new AutoGenerator();
        //全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setAuthor("唐秋");
        gc.setOutputDir(dir+"/generate/src/test/java");
        //打开输出目录
        gc.setOpen(false);
        gc.setSwagger2(true);
        //覆盖已有文件
        gc.setFileOverride(true);
        gc.setControllerName("%sController");
        gc.setEntityName("%sEntity");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        autoGenerator.setGlobalConfig(gc);
        //数据源配置
        DataSourceConfig dc = new DataSourceConfig();
        dc.setUrl("jdbc:mysql://47.107.108.16:3306/dc?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai&useSSL=false");
        dc.setDriverName("com.mysql.cj.jdbc.Driver");
        dc.setUsername("root");
        dc.setPassword("123456");
        autoGenerator.setDataSource(dc);
        //包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.zsm.core");
        pc.setController("controller");
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        autoGenerator.setPackageInfo(pc);
        //策略配置
        StrategyConfig sc = new StrategyConfig();
        //下划线变为驼峰命名
        //表
        sc.setNaming(NamingStrategy.underline_to_camel);
        //列
        sc.setColumnNaming(NamingStrategy.underline_to_camel);
        sc.setTablePrefix("dc_");
        sc.setFieldPrefix("dc_");
        sc.setInclude("dc_func");
        sc.setEntityLombokModel(true);
        sc.setControllerMappingHyphenStyle(true);
        //实体类属性对应的表字段，不开启可能会出错
        sc.entityTableFieldAnnotationEnable(true);
        autoGenerator.setStrategy(sc);
        autoGenerator.execute();
        System.out.println("---------------");
    }
}
