package com.niit.repository;

import com.niit.domain.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, String> {
    UserModel findByEmailAndPassword(String email, String password);
}
