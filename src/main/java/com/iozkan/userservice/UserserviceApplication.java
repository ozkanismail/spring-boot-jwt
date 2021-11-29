package com.iozkan.userservice;

import com.iozkan.userservice.domain.Role;
import com.iozkan.userservice.domain.User;
import com.iozkan.userservice.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
public class UserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

	/*@Bean
	CommandLineRunner run(UserService userService){
		return args -> {
			userService.saveRole(new Role(null,"ROLE_USER"));
			userService.saveRole(new Role(null,"ROLE_MANAGER"));
			userService.saveRole(new Role(null,"ROLE_ADMIN"));
			userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));

			userService.saveUser(new User(null,"İsmail Özkan","ismail16","1234",new ArrayList<>()));
			userService.saveUser(new User(null,"Akif Özkan","akif16","1234",new ArrayList<>()));
			userService.saveUser(new User(null,"Nefise Özkan","nefise16","1234",new ArrayList<>()));
			userService.saveUser(new User(null,"Muammer Özkan","muammer16","1234",new ArrayList<>()));

			userService.addRoleToUser("ismail16","ROLE_USER");
			userService.addRoleToUser("ismail16","ROLE_MANAGER");
			userService.addRoleToUser("ismail16","ROLE_ADMIN");
			userService.addRoleToUser("ismail16","ROLE_SUPER_ADMIN");

			userService.addRoleToUser("akif16","ROLE_USER");
			userService.addRoleToUser("nefise16","ROLE_USER");
			userService.addRoleToUser("muammer16","ROLE_USER");
		};
	}*/
}
