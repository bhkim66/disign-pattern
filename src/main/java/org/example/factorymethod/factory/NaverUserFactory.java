package org.example.factorymethod.factory;

import org.example.factorymethod.NaverUser;
import org.example.factorymethod.User;

public class NaverUserFactory extends AbstractUserFactory {
    @Override
    protected User createUser(final String id, final String name, final int age) {
        return new NaverUser(id, name, age);
    }
}
