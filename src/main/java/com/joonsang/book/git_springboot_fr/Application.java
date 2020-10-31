package com.joonsang.book.git_springboot_fr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    /**
     * @SpringBootApplication 으로 인해 스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정 된다.
     * 참고로 @SpringBootApplication 가 있는 위치부터 설정을 읽기 때문에, 이 클래스느 항상 프로젝트의 최상단에 위치한다.
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);     // 내장 WAS 실행
    }
}
