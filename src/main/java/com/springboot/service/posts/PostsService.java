package com.springboot.service.posts;

import com.springboot.Domain.posts.PostsRepository;
import com.springboot.web.dto.PostsSaveRequestDto;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service //우리가 쓰고 싶은 service 클래스에 @Service 어노테이션을 상단에 붙이면 spring이 service 클래스에 @Service가 붙어있는 객체를 알아서 postsService에 주입해줌
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}