package com.example.testdrivenutveckling;

import org.apache.catalina.User;

import java.util.Optional;

public class RepositoryKlass {
    public interface UserRepository extends JpaRepository<User, Long> {
        Optional<User> findByUsername(String username);
    }
}
