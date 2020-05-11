package com.cloudmusic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan(basePackages = {
		"com.cloudmusic.*"
})
//@MapperScan({"classpath*:mapper/*Mapper.xml"})
public class CloudmusicApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudmusicApplication.class, args);
	}

}
