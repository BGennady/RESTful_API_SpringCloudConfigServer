package ru.netology.RESTful_API_SpringCloudConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
//Config Server, читает настройки из реп-я и отдает их клиентам
@EnableConfigServer
public class ResTfulApiSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResTfulApiSpringCloudConfigServerApplication.class, args);
	}

}
