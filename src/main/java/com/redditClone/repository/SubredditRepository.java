package com.redditClone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redditClone.model.Subreddit;

@Repository
public interface SubredditRepository extends JpaRepository<Subreddit, Long>{

}
