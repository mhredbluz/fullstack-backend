package com.codewithmarcos.fullstackbackend.repository;

import com.codewithmarcos.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
