package org.example.factorymethod;

import org.example.factorymethod.factory.AbstractUserFactory;

import static org.example.factorymethod.factory.AbstractUserFactory.userFactoryMap;

public class User {
    private String id;
    private String name;
    private int age;


    public User(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public User makeUser(final String userType) {
        return userFactoryMap.getOrDefault(userType, new AbstractUserFactory() {
            @Override
            protected User createUser(final String id, final String name, final int age) {
                throw new IllegalArgumentException("존재하지 않는 타입");
            }
        }).createOperation(id, name, age);
    }
}

