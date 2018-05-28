package com.example.thelexie.repositories;

import com.example.thelexie.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}