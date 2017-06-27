package com.neucloud.dao;

import com.neucloud.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by neucloud on 2017/6/22.
 */
public interface UserRepository extends MongoRepository<User, String> {
    public User findByName(String name);
    public List<User> findByAge(int age);
}
