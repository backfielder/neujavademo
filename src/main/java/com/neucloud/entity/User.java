package com.neucloud.entity;

import org.springframework.data.annotation.Id;

/**
 * Created by neucloud on 2017/6/22.
 */
public class User {
    @Id
    public String id;
    public String name;
    public int age;

    public User() {}

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%s, name='%s', age=%s]",
                id, name, age);
    }


}
