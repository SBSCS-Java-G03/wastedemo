package com.ishang.wastedemo.admin.config;

import javax.servlet.Filter;
import javax.servlet.Servlet;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;


public class DruidConfig {
	
	/*
	 * druid配置類：注入屬性和配置連接池相關的配置
	 * 如黑白名單、監控管理後臺登錄賬戶密碼等。
	 * */	
	
	@Bean
	@ConditionalOnMissingBean
	public ServletRegistrationBean<Servlet> druidServlet(){ //注冊servlet信息，配置監控試圖
		
		ServletRegistrationBean<Servlet> servletRegistrationBean = new ServletRegistrationBean<Servlet>(new StatViewServlet(),"/druid/*");

		//白名單
		servletRegistrationBean.addInitParameter("allow", "127.0.0.1,139,196,87,48");
		
		//IP黑名單  黑白衝突時 deny>allow 
		servletRegistrationBean.addInitParameter("deny","192.168.1.119");
		//如果滿足deny,提示：Sorry, you are not permitted to view this page.
		
		//登錄查看信息的賬號和密碼 用於登錄druid監控密碼
		servletRegistrationBean.addInitParameter("loginUsername", "admin");
		servletRegistrationBean.addInitParameter("loginPassword", "admin");
		
		//是否能夠重置數據
		servletRegistrationBean.addInitParameter("resetEnable", "true");
		
		return servletRegistrationBean;
		
	}
	
	@Bean
	@ConditionalOnMissingBean
	public FilterRegistrationBean<Filter> filterRegistrationBean(){ //注冊filter信息，監控攔截器
		
		FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<Filter>();
		filterRegistrationBean.setFilter(new WebStatFilter());
		filterRegistrationBean.addUrlPatterns("/*");;
		filterRegistrationBean.addInitParameter("exclusions", "*。js,*.gif,*.png,*.css,*.ico,/druid/*");
		
		return filterRegistrationBean;
		
	}
	
}
