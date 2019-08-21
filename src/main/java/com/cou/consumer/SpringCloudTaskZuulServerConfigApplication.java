package com.cou.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringCloudTaskZuulServerConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTaskZuulServerConfigApplication.class, args);
	}

}
