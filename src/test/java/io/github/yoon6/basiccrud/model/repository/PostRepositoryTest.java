package io.github.yoon6.basiccrud.model.repository;

import io.github.yoon6.basiccrud.model.entity.PostEntity;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class PostRepositoryTest {

    @Autowired PostRepository postRepository;

    @Test
    void 엔티티_저장_조회() {
        PostEntity entity = new PostEntity();
        entity.setTitle("Title1");
        entity.setAuthor("Author1");
        entity.setContent("Content1");

        postRepository.save(entity);

        Optional<PostEntity> find = postRepository.findById(1L);

        System.out.println(find.get());
        Assertions.assertThat(find.get()).isEqualTo(entity);
    }

}