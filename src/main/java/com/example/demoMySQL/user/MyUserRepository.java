package com.example.demoMySQL.user;

import org.springframework.data.repository.CrudRepository;

public interface MyUserRepository extends CrudRepository<MyUser,Long> {
}
