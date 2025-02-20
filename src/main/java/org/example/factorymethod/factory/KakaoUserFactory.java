package org.example.factorymethod.factory;

import org.example.factorymethod.KakaoUser;
import org.example.factorymethod.User;

public class KakaoUserFactory extends AbstractUserFactory {
    @Override
    protected User createUser(final User user) {
        return new KakaoUser(user);
    }
}
