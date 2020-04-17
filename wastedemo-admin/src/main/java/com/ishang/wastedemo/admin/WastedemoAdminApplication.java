package com.ishang.wastedemo.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication  //默认扫描当前启动的包及子包的组件
@SpringBootApplication(scanBasePackages = "com.ishang.wastedemo" ) //扫描当前包
@ComponentScan(basePackages = "com.ishang.wastedemo.admin.**")
//@MapperScan({"com.ishang.wastedemo.admin.dao"})
@EntityScan(basePackages = "com.ishang.wastedemo.**.entity") 
public class WastedemoAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(WastedemoAdminApplication.class, args);
	}

	
}
