package com.app.aforo255.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ServicesBankaforo255GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicesBankaforo255GatewayApplication.class, args);
	}

}
