package com.beratyesbek.basicjparepositorypattern.repository;

import com.beratyesbek.basicjparepositorypattern.model.User;
import com.beratyesbek.basicjparepositorypattern.repository.base.BaseRepositoryImpl;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryImpl extends BaseRepositoryImpl<User, Integer> implements UserRepository{

    public UserRepositoryImpl() {
        super(User.class);
    }
}
