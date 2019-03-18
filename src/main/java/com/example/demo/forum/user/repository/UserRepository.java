package com.example.demo.forum.user.repository;

import com.example.demo.forum.user.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {

}
