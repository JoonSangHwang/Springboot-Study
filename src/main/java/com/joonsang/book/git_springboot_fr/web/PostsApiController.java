package com.joonsang.book.git_springboot_fr.web;

import com.joonsang.book.git_springboot_fr.service.posts.PostsService;
import com.joonsang.book.git_springboot_fr.web.dto.PostsResponseDto;
import com.joonsang.book.git_springboot_fr.web.dto.PostsSaveRequestDto;
import com.joonsang.book.git_springboot_fr.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {

        System.out.println("id : " + id);
        System.out.println("requestDto : " + requestDto);

        return postsService.update(id, requestDto);
    }

//    @DeleteMapping("/api/v1/posts/{id}")
//    public Long delete(@PathVariable Long id) {
//        postsService.delete(id);
//        return id;
//    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }

//    @GetMapping("/api/v1/posts/list")
//    public List<PostsListResponseDto> findAll() {
//        return postsService.findAllDesc();
//    }
}
