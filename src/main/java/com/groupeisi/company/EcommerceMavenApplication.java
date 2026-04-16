package com.groupeisi.company;

import com.groupeisi.company.entities.Users;
import com.groupeisi.company.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.groupeisi.company.repository")
public class EcommerceMavenApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EcommerceMavenApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(EcommerceMavenApplication.class, args);
    }

    @Bean
    public CommandLineRunner initUsers(UsersRepository usersRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            if (usersRepository.count() == 0) {
                Users admin = new Users();
                admin.setEmail("admin@email.com");
                admin.setPassword(passwordEncoder.encode("admin123"));
                usersRepository.save(admin);
                System.out.println("Default admin user created: admin@email.com / admin123");
            }
        };
    }
}