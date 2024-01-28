package com.beratyesbek.basicjparepositorypattern.jparepositoy;

import com.beratyesbek.basicjparepositorypattern.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
