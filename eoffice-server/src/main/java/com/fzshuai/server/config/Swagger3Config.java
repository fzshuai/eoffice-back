// package com.fzshuai.server.config;
//
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import springfox.documentation.builders.ApiInfoBuilder;
// import springfox.documentation.builders.PathSelectors;
// import springfox.documentation.builders.RequestHandlerSelectors;
// import springfox.documentation.oas.annotations.EnableOpenApi;
// import springfox.documentation.service.*;
// import springfox.documentation.spi.DocumentationType;
// import springfox.documentation.spi.service.contexts.SecurityContext;
// import springfox.documentation.spring.web.plugins.Docket;
//
// import java.util.ArrayList;
// import java.util.List;
//
// /**
//  * Swagger3配置类
//  *
//  * @author fzshuai
//  * @date 2022/03/16 22:20
//  * @since 1.0
//  */
// @Configuration
// public class Swagger3Config {
//
//     @Bean
//     public Docket createRestApi() {
//         return new Docket(DocumentationType.OAS_30)
//                 // 文档描述
//                 .apiInfo(apiInfo())
//                 // 接口暴露
//                 .select()
//                 // 扫描所有带注解的方法
//                 .apis(RequestHandlerSelectors.basePackage("com.fzshuai.server.controller"))
//                 // 满足任何路径
//                 .paths(PathSelectors.any())
//                 .build()
//                 // 设置安全模式，swagger可以设置访问token
//                 .securitySchemes(securitySchemes())
//                 .securityContexts(securityContexts());
//     }
//
//
//     private ApiInfo apiInfo() {
//         return new ApiInfoBuilder()
//                 .title("系统接口文档")
//                 .description("系统详细接口文档")
//                 .version("1.0")
//                 .contact(new Contact("fzshuai", "http:localhost:8081/doc.html", "fzshuai@foxmail.com"))
//                 .build();
//
//     }
//
//     /**
//      * 安全模式，这里指定token通过Authorization头请求头传递
//      */
//     private List<SecurityScheme> securitySchemes() {
//         List<SecurityScheme> apiKeyList = new ArrayList<SecurityScheme>();
//         apiKeyList.add(new ApiKey("Authorization", "Authorization", "header"));
//         return apiKeyList;
//     }
//
//     /**
//      * 安全上下文
//      */
//     private List<SecurityContext> securityContexts() {
//         List<SecurityContext> securityContexts = new ArrayList<>();
//         securityContexts.add(
//                 SecurityContext.builder()
//                         .securityReferences(defaultAuth())
//                         .operationSelector(o -> o.requestMappingPattern().matches("/.*"))
//                         .build());
//         return securityContexts;
//     }
//
//     /**
//      * 默认的安全上引用
//      */
//     private List<SecurityReference> defaultAuth() {
//         AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
//         AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
//         authorizationScopes[0] = authorizationScope;
//         List<SecurityReference> securityReferences = new ArrayList<>();
//         securityReferences.add(new SecurityReference("Authorization", authorizationScopes));
//         return securityReferences;
//     }
// }
