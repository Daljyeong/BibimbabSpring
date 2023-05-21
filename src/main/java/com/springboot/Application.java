package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication //스프링부트의 자동 설정, 스프링 Bean 읽기 생성을 모두 자동으로 설정해줌
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args); //SpringApplication.run() => 내장 WAS 실행
    }
}