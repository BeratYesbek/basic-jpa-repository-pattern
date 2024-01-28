package com.beratyesbek.basicjparepositorypattern.repository;

import com.beratyesbek.basicjparepositorypattern.model.User;
import com.beratyesbek.basicjparepositorypattern.repository.base.BaseRepository;


public interface UserRepository extends BaseRepository<User, Integer> {
}
