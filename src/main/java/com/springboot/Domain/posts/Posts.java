package com.springboot.Domain.posts;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor; //기본 생성자 생성

@Getter //Lombok에서 지원하는 어노테이션(@Getter => 모든 필드의 Getter 메소드를 자동 생성함)
@NoArgsConstructor //Lombok에서 지원하는 어노테이션(@NoArgsConstructor => 기본 생성자가 자동 추가되는 기능)
@Entity //JPA가 관리해주고 테이블에 매핑해줌(테이블과 링크될 클래스를 나타냄)
public class Posts {

    @Id //해당 테이블의 Primary Key 필드
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GeneratedValue => PK 생성 규칙을 나타냄
    //strategy = GenerationType.IDENTITY => auto_increment 방식으로 pk 지정해줌
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder //Lombok에서 지원하는 어노테이션(생성자 대신 @Builder 를 통해 제공되는 빌더 클래스를 사용 중)
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
