package cn.qw.microservicecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "cn.qw.microservicecloud.dao")
public class Applicatsion {


    public static void main(String[] args) {
        SpringApplication.run(Applicatsion.class,args);
    }
}
