package org.example.factorymethod;

public class UserService {
    public User makeUser(final String userType, final User user) {
        return user.makeUser(userType);
    }

}
