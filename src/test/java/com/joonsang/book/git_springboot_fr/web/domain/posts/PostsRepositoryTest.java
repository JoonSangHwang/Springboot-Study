package com.joonsang.book.git_springboot_fr.web.domain.posts;

import com.joonsang.book.git_springboot_fr.web.HelloControllerTest;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = HelloControllerTest.class)
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    /**
     * JUnit 에서 단위 테스트가 끝날 때마다 수행되는 메소드
     * -> 여러 테스트가 동시에 수행되면, 데이터 침범이 있을수 있어 사용
     */
    @After
    public void cleanup() {
        postsRepository.deleteAll();
    }

    @Test
    public void 게시글저장_불러오기() {
        // given
        String title = "테스트 게시글";
        String content = "테스트 본문";

        postsRepository.save(Posts.builder()                    // Insert , Update
                .title(title)
                .content(content)
                .author("joonsang@email.com")
                .build()
        );

        // when
        List<Posts> postsList = postsRepository.findAll();      // SELECT

        // then
        Posts posts = postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
    }

}
