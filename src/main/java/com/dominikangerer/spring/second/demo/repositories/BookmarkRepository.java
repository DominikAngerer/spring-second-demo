package com.dominikangerer.spring.second.demo.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dominikangerer.spring.second.demo.model.Bookmark;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    Collection<Bookmark> findByAccountUsername(String username);
}