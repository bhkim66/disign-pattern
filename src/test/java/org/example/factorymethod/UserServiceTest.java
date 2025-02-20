package org.example.factorymethod;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class UserServiceTest {

    @Test
    @DisplayName("kakao 유저 생성 테스트")
    void makeKakaoUser() {
        UserService userService = new UserService();
        String userType = "kakao";
        String id = "bestKim";
        String name = "박병춘";
        int age = 10;

        User user = new User(id, name, age);

        User kakaoUser = userService.makeUser(userType, user);

        assertThat(kakaoUser).extracting("id", "name", "age")
                .containsExactly(id, name, age);
    }

    @Test
    @DisplayName("naver 유저 생성 테스트")
    void makeNaverUser() {
        UserService userService = new UserService();
        String userType = "naver";
        String id = "bestKim";
        String name = "박병춘";
        int age = 10;

        User user = new User(id, name, age);

        User naverUser = userService.makeUser(userType, user);

        assertThat(naverUser).extracting("id", "name", "age")
                .containsExactly(id, name, age);
    }

    @Test
    @DisplayName("없는 타입 유저 생성 예외 발생")
    void makeUser() {
        UserService userService = new UserService();
        String userType = "foo";
        String id = "bestKim";
        String name = "박병춘";
        int age = 10;

        User user = new User(id, name, age);

        assertThatThrownBy(() -> {
            userService.makeUser(userType, user);
        }).hasMessageContaining("존재하지 않는 타입");


    }
}