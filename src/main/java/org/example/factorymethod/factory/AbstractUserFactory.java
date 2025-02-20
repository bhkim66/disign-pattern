package org.example.factorymethod.factory;

import org.example.factorymethod.User;

public abstract class AbstractUserFactory {

    public User createOperation() {
        return createUser();
    }

    protected abstract User createUser();
}

