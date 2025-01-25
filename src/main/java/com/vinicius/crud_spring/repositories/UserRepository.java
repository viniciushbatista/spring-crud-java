package com.vinicius.crud_spring.repositories;

import com.vinicius.crud_spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Long> {

}
