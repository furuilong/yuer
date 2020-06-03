package cn.bdqn.demo99;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.bdqn.demo99.mapper")
public class Demo99Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo99Application.class, args);
    }

}
