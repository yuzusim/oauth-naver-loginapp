package com.example.oauthnaverloginapp.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

// 쿼리메소드
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(@Param("username") String username);
}
