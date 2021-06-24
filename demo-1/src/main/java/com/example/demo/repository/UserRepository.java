package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.UserRecord;

public interface UserRepository extends CrudRepository<UserRecord,Integer>{

}
