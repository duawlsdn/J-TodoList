package com.korit.jtodolistback.dto;

import com.korit.jtodolistback.domain.Todo;
import lombok.Data;

@Data
public class ModifyReqDto {
    private String content;

    public Todo toEntity(Integer todoId) {
        return Todo.builder()
                .todoId(todoId)
                .todoContent(content)
                .build();
    }
}
