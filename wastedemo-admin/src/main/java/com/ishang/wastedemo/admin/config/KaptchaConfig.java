package com.ishang.wastedemo.admin.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;

/**
 * 验证码配置
 * 
 * @author AsteriskFang
 *
 */
@Configuration
public class KaptchaConfig {
	
	@Bean
	public DefaultKaptcha producer() { //生成文字验证码
		Properties properties = new Properties();
		//有很多属性可以自定义
		properties.put("kaptcha.border", "no");
		properties.put("kaptcha.textproducer.font.color","black");
		properties.put("kaptcha.textproducer.char.space", "5");
		
		Config config= new Config(properties);
		DefaultKaptcha defaultKaptcha =new DefaultKaptcha();
		defaultKaptcha.setConfig(config);
		return defaultKaptcha;
	}
}
