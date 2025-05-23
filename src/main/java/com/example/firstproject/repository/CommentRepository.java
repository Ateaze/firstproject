package com.example.firstproject.repository;

import com.example.firstproject.entity.Comment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommentRepository extends CrudRepository<Comment, Long> {
    // 특정 게시글의 모든 댓글 조회
    @Query(value = "SELECT * FROM comment WHERE article_id = :articleId",
    nativeQuery = true)
    List<Comment> findByArticleId(Long articleId);
    // 특정 닉네임의 모든 댓글 조회
    List<Comment> findByNickname(String nickname);

    Long article_id(Long articleId);
}
