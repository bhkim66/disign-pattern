package org.example.factorymethod.factory;

import org.example.factorymethod.User;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractUserFactory {
    public static Map<String, AbstractUserFactory> userFactoryMap = new HashMap<>(
            Map.of(
                    "naver", new NaverUserFactory(),
                    "kakao", new KakaoUserFactory()
            ));

    public User createOperation(final String id, final String name, final int age) {
        velidateId(id);
        return createUser(id, name, age);
    }

    private void velidateId(String id) {
        System.out.println("id validation");
    }

    private void velidateUser(User user) {
        System.out.println("user validation");
    }

    protected abstract User createUser(final String id, final String name, final int age);
}

