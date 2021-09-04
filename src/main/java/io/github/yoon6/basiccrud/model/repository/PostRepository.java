package io.github.yoon6.basiccrud.model.repository;

import io.github.yoon6.basiccrud.model.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostEntity, Long> {
}
