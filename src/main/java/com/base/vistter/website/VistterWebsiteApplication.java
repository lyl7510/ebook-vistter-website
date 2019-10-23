package com.base.vistter.website;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.base.vistter.website.*")
public class VistterWebsiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(VistterWebsiteApplication.class, args);
    }

}
