package com.liyuan.microservice.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudModulesAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudModulesAccountApplication.class, args);
	}
}
