package com.korit.jtodolistback.service;

import com.korit.jtodolistback.domain.Todo;
import com.korit.jtodolistback.domain.TodoMapper;
import com.korit.jtodolistback.dto.ModifyReqDto;
import com.korit.jtodolistback.dto.RegisterReqDto;
import com.korit.jtodolistback.dto.TodoListRespDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoMapper todoMapper;

    public void register(RegisterReqDto dto) {
        todoMapper.insert(dto.toEntity());
    }
    public List<TodoListRespDto> getTodoList() {
        return todoMapper.findAll().stream().map(Todo::toDto).collect(Collectors.toList());
//        return todoMapper.findAll().stream().map(todo -> todo.toDto()).collect(Collectors.toList());
    }
    public void modify(Integer todoId, ModifyReqDto dto) {
        todoMapper.update(dto.toEntity(todoId));
    }
    public void deleteOne(Integer todoId) {
        todoMapper.deleteOneById(todoId);
    }
    public void deleteAll(List<Integer> todoIds) {
        todoMapper.deleteAllByIds(todoIds);
    }
}

