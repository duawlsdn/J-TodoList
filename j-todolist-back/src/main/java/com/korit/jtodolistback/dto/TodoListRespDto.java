package com.korit.jtodolistback.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class TodoListRespDto {
    private Integer id;
    private String content;
    private LocalDateTime date;
}
