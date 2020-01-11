package cn.qw.microservicecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "cn.qw.microservicecloud.dao")
@EnableEurekaClient
public class Applicatsion {


    public static void main(String[] args) {
        SpringApplication.run(Applicatsion.class,args);
    }
}
