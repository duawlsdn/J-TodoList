package com.korit.jtodolistback.domain;

import com.korit.jtodolistback.dto.TodoListRespDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Todo {
    private Integer todoId;
    private String todoContent;
    private LocalDateTime todoDate;

    public TodoListRespDto toDto() {
        return TodoListRespDto.builder()
                .id(todoId)
                .content(todoContent)
                .date(todoDate)
                .build();
    }
}
