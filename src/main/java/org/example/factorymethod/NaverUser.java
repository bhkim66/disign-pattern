package org.example.factorymethod;

public class NaverUser extends User {
    @Override
    void makeUser(String name) {
        this.name = name;
    }
}
