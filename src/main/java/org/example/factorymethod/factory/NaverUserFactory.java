package org.example.factorymethod.factory;

import org.example.factorymethod.NaverUser;
import org.example.factorymethod.User;

public class NaverUserFactory extends AbstractUserFactory {
    @Override
    protected User createUser(final User user) {
        return new NaverUser(user);
    }
}
