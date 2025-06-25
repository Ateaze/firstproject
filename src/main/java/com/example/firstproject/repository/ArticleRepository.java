package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

public interface ArticleRepository extends CrudRepository<Article, Long> {
    @Override
    ArrayList<Article> findAll();

    // ID 기준 내림차순 정렬
    ArrayList<Article> findAllByOrderByIdDesc();

    List<Article> id(Long id);

    // 최대 ID 값 조회
    @Query("SELECT COALESCE(MAX(a.id), 0) FROM Article a")
    Long findMaxId();

    // AUTO_INCREMENT 값 리셋
    @Modifying
    @Transactional
    @Query(value = "ALTER TABLE article AUTO_INCREMENT = ?1", nativeQuery = true)
    void resetAutoIncrement(Long nextId);
}
