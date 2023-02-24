package com.example.demoMySQL.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyLoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(MyLoadDatabase.class);

    @Bean
    CommandLineRunner initMyUserDatabase(MyUserRepository myUserRepository){
        return args -> {
          log.info("新增用户 "+myUserRepository.save(new MyUser("gdb","31")));
          log.info("新增用户 "+myUserRepository.save(new MyUser("gudebin","19")));
        };
    }
}
