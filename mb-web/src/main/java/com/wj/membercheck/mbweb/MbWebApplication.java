package com.wj.membercheck.mbweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by white_wolf on 2019/10/7.
 *
 * @author thebestwj
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.wj.membercheck"})
@MapperScan(basePackages = "com.wj.membercheck.mbdao.mapper")
public class MbWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(MbWebApplication.class, args);
    }

}
