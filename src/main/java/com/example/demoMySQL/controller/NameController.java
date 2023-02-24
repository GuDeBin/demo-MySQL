package com.example.demoMySQL.controller;

import com.example.demoMySQL.entity.Name;
import com.example.demoMySQL.repository.NameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/name")
public class NameController {

    @Autowired
    private NameRepository nameRepository;

    // 新增一条记录
    @PostMapping(path = "add")
    public @ResponseBody String addNewName(@RequestParam String name,@RequestParam String password){
        Name name1=new Name();
        name1.setName(name);
        name1.setPassword(password);
        nameRepository.save(name1);
        return "Saved";
    }


    // 查询所有的记录
    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Name> getAllName(){
        return nameRepository.findAll();
    }
}
