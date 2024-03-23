package com.redditClone.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redditClone.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
