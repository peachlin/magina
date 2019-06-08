package com.zmsj.magina;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author wangk
 */
@EnableSwagger2
@MapperScan(basePackages = "com.zmsj.magina.dao")
@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  @Lazy
  public Docket createRestApi() {
    return new Docket(DocumentationType.SWAGGER_2).select().apis(
        RequestHandlerSelectors.basePackage("com.zmsj.magina"))
        .paths(PathSelectors.any()).build()
        .apiInfo(new ApiInfoBuilder().title("生态可视化系统").description("生态可视化系统")
            .version("1.0").build());
  }
}
