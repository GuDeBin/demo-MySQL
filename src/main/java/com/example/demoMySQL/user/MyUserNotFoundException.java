package com.example.demoMySQL.user;

public class MyUserNotFoundException extends RuntimeException{
    MyUserNotFoundException(Long id){
        super("未找到 " + id);
    }
}
