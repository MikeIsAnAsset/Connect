package com.claim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import Upload.StorageProperties;
//
@SpringBootApplication//(scanBasePackages = {"boot.registration"} , exclude = JpaRepositoriesAutoConfiguration.class)
@EnableConfigurationProperties(StorageProperties.class)
public class MyCapstoneProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCapstoneProjectApplication.class, args);
	}
}
