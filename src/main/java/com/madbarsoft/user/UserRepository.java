package com.madbarsoft.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author MD IMRAN HOSSAIN
 *
 */
public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByEmail(String email);
}
