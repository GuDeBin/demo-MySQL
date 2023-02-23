package com.example.demoMySQL.controller;

import com.example.demoMySQL.entity.Name;
import com.example.demoMySQL.repository.NameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/name")
public class NameController {

    @Autowired
    private NameRepository nameRepository;

    // 新增一条记录
    @PostMapping(path = "add")


    // 查询所有的记录
    @GetMapping(path = "/all")
    public Iterable<Name> getAllName(){
        return nameRepository.findAll();
    }
}
