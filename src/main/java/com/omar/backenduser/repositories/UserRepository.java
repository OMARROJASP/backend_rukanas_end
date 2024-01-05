package com.omar.backenduser.repositories;

import com.omar.backenduser.model.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
