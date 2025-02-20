package org.example.factorymethod.factory;

import org.example.factorymethod.KakaoUser;
import org.example.factorymethod.User;

public class KakaoUserFactory extends AbstractUserFactory {
    @Override
    protected User createUser(final String id, final String name, final int age) {
        return new KakaoUser(id, name, age);
    }
}
