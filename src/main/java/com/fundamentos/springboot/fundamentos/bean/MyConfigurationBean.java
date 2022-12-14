package com.fundamentos.springboot.fundamentos.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {

	@Bean
	public MyBean beanOperation() {
		return new MyBeanImplement();
	}
	
	@Bean
	public MyOperation operation() {
		return new MyOperationImplement();
	}
	
	@Bean
	public MyBeanWithDependency myBean() {
		return new MyBeanWithDependencyImplement(null);
	}
}
