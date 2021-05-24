package com.liuwork.framework.util.swagger2;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName Swagger2Config
 * @Author liuzhihao
 * @Description
 * @Date 2021/3/14 20:38
 * @Version 1.0.0
 */
@Configuration
@EnableSwagger2
@PropertySource("classpath:swagger.properties")
public class Swagger2Config {
    @Bean
    public Docket productApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //添加ApiOperiation注解的被扫描
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("对外开放接口的API文档")
                .description("HTTP对外开放接口")
                .version("1.0")
                .termsOfServiceUrl("http://www.liuzhihao.xyz")
                .license("LICENSE")
                .licenseUrl("http://www.liuzhihao.xyz")
                .build();
    }
}
