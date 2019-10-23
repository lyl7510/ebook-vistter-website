package com.base.vistter.website;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.base.vistter.website.*")
public class VistterTomcatWebsiteApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(VistterTomcatWebsiteApplication.class, args);
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(VistterTomcatWebsiteApplication.class);
    }
}
