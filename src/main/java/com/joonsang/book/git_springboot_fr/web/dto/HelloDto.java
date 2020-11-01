package com.joonsang.book.git_springboot_fr.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor    // final 필드가 포함된 생성자를 지원
public class HelloDto {
    private final String name;
    private final int amount;
}
