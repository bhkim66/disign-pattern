package org.example.factorymethod;

public class KakaoUser extends User {
    @Override
    void makeUser(String name) {
        this.name = name;
    }
}
