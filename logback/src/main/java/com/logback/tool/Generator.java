package com.logback.tool;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @author sky
 */
public class Generator {

    public static void main(String[] args) {
        AutoGenerator autoGenerator = new AutoGenerator();

        GlobalConfig config = new GlobalConfig();
        config.setActiveRecord(true)  //支持Ar模式
                .setAuthor("WeiWei")
                .setOpen(false)
                .setFileOverride(true)
                .setOutputDir("src\\main\\java\\")
                .setEnableCache(false)// XML 二级缓存
                .setBaseResultMap(true)// XML ResultMap
                .setBaseColumnList(true)// XML columList
                .setServiceName("I%sService")
                .setMapperName("%sDao");
        autoGenerator.setGlobalConfig(config);

        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setDriverName("com.mysql.jdbc.Driver")
                .setUsername("root")
                .setPassword("root")
                .setUrl("jdbc:mysql://127.0.0.1:3306/chat?characterEncoding=utf8&serverTimezone=Hongkong&useSSL=false&allowPublicKeyRetrieval=true");
        autoGenerator.setDataSource(dataSourceConfig);

        StrategyConfig strategyConfig = new StrategyConfig();

        strategyConfig.setTablePrefix("t_") //此处可以修改为您的表前缀
                .setNaming(NamingStrategy.underline_to_camel) // 表名生成策略
                .setColumnNaming(NamingStrategy.underline_to_camel)
                //表字段注解
                .setEntityTableFieldAnnotationEnable(true)
                .setInclude(new String[]{"users"}) //需要生成的表
                .setEntityLombokModel(true) //Lombok
                .setRestControllerStyle(true);
        autoGenerator.setStrategy(strategyConfig);

        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.logback")
                .setEntity("beans.po")
                .setMapper("dao")
                .setService("service")
                .setController("controller")// 这里是控制器包名，默认 web
                .setServiceImpl("service.impl")
        ;
        autoGenerator.setPackageInfo(packageConfig);

        TemplateConfig templateConfig = new TemplateConfig();
        //设置不生成xml
        templateConfig.setXml(null);

        autoGenerator.setTemplate(templateConfig);

        autoGenerator.execute();
    }

}
