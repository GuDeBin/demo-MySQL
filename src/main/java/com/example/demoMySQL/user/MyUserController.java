package com.example.demoMySQL.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/user")
public class MyUserController {

    @Autowired
    private MyUserRepository myUserRepository;

    // 删除用户
    @DeleteMapping(path = "/{id}")
    public @ResponseBody String deleteUser(@PathVariable Long id){
        myUserRepository.deleteById(id);
        return "删除用户 " + id;
    }

    // 获取单个用户
    @GetMapping(path = "/{id}")
    public MyUser getMyUser(@PathVariable Long id){
        return myUserRepository.findById(id).orElseThrow(() -> new MyUserNotFoundException(id));
    }

    // 修改用户
    @PutMapping(path = "/{id}")
    public MyUser replaceMyUser(@RequestBody MyUser newMyUser,@PathVariable Long id){
        return myUserRepository.findById(id).map(MyUser->{
            MyUser.setName(newMyUser.getName());
            MyUser.setAge(newMyUser.getAge());
            return myUserRepository.save(MyUser);
        }).orElseGet(()->{
           newMyUser.setId(id);
           return myUserRepository.save(newMyUser);
        });
    }

    // 新增用户
    @PostMapping(path = "/add")
    public MyUser addNewUser(@RequestBody MyUser newMyUser ){
        return myUserRepository.save(newMyUser);
    }

    // 获取全部用户
    @GetMapping(path = "/all")
    public Iterable<MyUser> getAllMyUsers(){
        return myUserRepository.findAll();
    }
}
