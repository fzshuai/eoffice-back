package com.fzshuai.generator;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * mybatis-plus代码生成器
 *
 * @author fzshuai
 * @date 2022/03/13 16:45
 * @since 1.0
 */
public class CodeGenerator {

	public static void main(String[] args) {

		List<String> tables = new ArrayList<>();
		tables.add("t_admin");
		// 项目路径
		String projectPath = System.getProperty("user.dir");

		// 代码生成器
		FastAutoGenerator.create("jdbc:mysql://localhost:3306/eoffice_fzs?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai", "root", "123456")
				// 全局配置
				.globalConfig(builder -> {
					// 作者
					builder.author("fzshuai")
							// 输出路径
							.outputDir(projectPath + "/eoffice-generator/src/main/java")
							// 禁止打开输出目录
							.disableOpenDir()
							// 开启swagger
							.enableSwagger()
							// 注释日期
							.commentDate("yyyy/MM/dd HH:mm")
							// 开启覆盖之前生成的文件
							.fileOverride();
				})
				.packageConfig(builder -> {
					builder.parent("com.fzshuai")
							.moduleName("generator")
							.entity("pojo")
							.service("service")
							.serviceImpl("service.impl")
							.controller("controller")
							.mapper("mapper")
							.xml("mapper")
							.pathInfo(Collections.singletonMap(OutputFile.mapperXml, projectPath + "/eoffice-generator/src/main/resources/mapper/"));
				})
				.strategyConfig(builder -> {
					builder.addInclude(tables)
							// 增加过滤表前缀
							.addTablePrefix("t_")
							// service策略配置
							.serviceBuilder()
							.formatServiceFileName("%sService")
							.formatServiceImplFileName("%sServiceImpl")
							// entity策略配置
							.entityBuilder()
							// 数据库表映射到实体的命名策略
							.naming(NamingStrategy.underline_to_camel)
							// 数据库表字段映射到实体的命名策略
							.columnNaming(NamingStrategy.no_change)
							// 开启lombok模型
							.enableLombok()
							// 逻辑删除字段名
							.logicDeleteColumnName("deleted")
							// 开启生成实体时生成字段注解
							.enableTableFieldAnnotation()
							// controller策略设置
							.controllerBuilder()
							.formatFileName("%sController")
							.enableRestStyle()
                            .enableHyphenStyle()
                            // mapper策略设置
							.mapperBuilder()
							// 生成通用的resultMap
							.enableBaseResultMap()
							.superClass(BaseMapper.class)
							.formatMapperFileName("%sMapper")
							.enableMapperAnnotation()
							.formatXmlFileName("%sMapper");
				})
				// 使用Freemarker引擎模板，默认的是Velocity引擎模板
				.templateEngine(new FreemarkerTemplateEngine())
				.execute();
	}

}
