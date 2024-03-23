package com.redditClone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redditClone.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{

}
