package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import com.netflix.discovery.shared.Application;

@RunWith(SpringRunner.class)
@ComponentScan(basePackages={"com.example.*"})
@SpringBootTest(classes=Application.class)
class ZuulServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}