package org.example.factorymethod;

import org.example.factorymethod.factory.AbstractUserFactory;
import org.example.factorymethod.factory.KakaoUserFactory;
import org.example.factorymethod.factory.NaverUserFactory;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<String, AbstractUserFactory> factoryMap;

    public UserService() {
        factoryMap = new HashMap<>(
                Map.of(
                        "naver", new NaverUserFactory(),
                        "kakao", new KakaoUserFactory()
                )
        );
    }

    public User makeUser(String userType) {
        return factoryMap.getOrDefault(userType, new AbstractUserFactory() {
            @Override
            protected User createUser() {
                throw new IllegalArgumentException("존재하지 않는 타입");
            }
        }).createOperation();
    }

    public void test() {
        NaverUser naverUser = new NaverUser();
    }
}
