package org.example.factorymethod.factory;

import org.example.factorymethod.User;

public abstract class AbstractUserFactory {

    public User createOperation(final User user) {
        return createUser(user);
    }

    protected abstract User createUser(final User user);
}

