package com.posso.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import com.posso.usuarios.configuration.Configuration;

@EnableDiscoveryClient
@SpringBootApplication
//@ComponentScan({"com.posso.common.usuario.models.entity"}) 
@EntityScan(basePackages = {"com.posso.common.usuario.models.entity"})
@EnableConfigurationProperties(Configuration.class)
public class MicroservicioUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioUsuariosApplication.class, args);
	}

}
