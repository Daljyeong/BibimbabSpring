package com.springboot.web;

import com.springboot.service.posts.PostsService;
import com.springboot.web.dto.PostsResponseDto;
import com.springboot.web.dto.PostsSaveRequestDto;
import com.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor //final이 붙은 필드에 대해 생성자를 자동으로 생성해줌
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts") ///api/v1/posts 요청 URL로 들어오는 HTTP POST 요청을 처리하는 메소드라는 것을 의미함
    public long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    //@PathVariable Long id => HTTP URL의 {id}를 파라미터로 받아옴
    public long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }
}