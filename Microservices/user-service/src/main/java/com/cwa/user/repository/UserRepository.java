package com.cwa.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cwa.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

//	User saveUser(User user);

	User findByUserId(Long userId);

}