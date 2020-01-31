package com.eatza.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient

public class OrderingserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderingserviceApplication.class, args);
	}
	
	/*
	 * @Bean public FilterRegistrationBean jwtFilterBean() { final
	 * FilterRegistrationBean registrationBean = new FilterRegistrationBean();
	 * registrationBean.setFilter(new JwtFilter());
	 * registrationBean.addUrlPatterns("/order/*");
	 * 
	 * return registrationBean; }
	 */

}
