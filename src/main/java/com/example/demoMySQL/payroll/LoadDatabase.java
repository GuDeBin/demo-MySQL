package com.example.demoMySQL.payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository){
        return args -> {
            log.info("预加载 "+repository.save(new Employee("gdb","测试-1")));
            log.info("预加载 "+repository.save(new Employee("gudebin","测试-2")));
        };
    }
}
