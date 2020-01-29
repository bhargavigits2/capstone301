package com.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.model.User;

import javax.jws.soap.SOAPBinding;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {


    Optional<User> findByUsername(String name);

}
