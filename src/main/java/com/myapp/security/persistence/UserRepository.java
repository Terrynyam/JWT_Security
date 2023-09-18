package com.myapp.security.persistence;

import com.myapp.security.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Terrance Nyamfukudza
 * @date 16/Sep/2023
 */
public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);
}
