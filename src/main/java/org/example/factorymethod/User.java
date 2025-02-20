package org.example.factorymethod;

public class User {
    private String id;
    private String name;
    private int age;

    public User(User user) {
        this.id = user.id;
        this.name = user.name;
        this.age = user.age;
    }
}

