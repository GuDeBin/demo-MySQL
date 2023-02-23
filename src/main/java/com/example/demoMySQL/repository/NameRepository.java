package com.example.demoMySQL.repository;
import com.example.demoMySQL.entity.Name;
import org.springframework.data.repository.CrudRepository;
public interface NameRepository extends CrudRepository<Name,Integer>{
}