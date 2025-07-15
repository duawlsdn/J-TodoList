package com.korit.jtodolistback.dto;

import com.korit.jtodolistback.domain.Todo;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RegisterReqDto {
    private String content;
    private LocalDateTime date;

    public Todo toEntity() {
        return Todo.builder()
                .todoContent(content)
                .todoDate(date)
                .build();
    }
}
