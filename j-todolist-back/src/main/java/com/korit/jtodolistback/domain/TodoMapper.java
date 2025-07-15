package com.korit.jtodolistback.domain;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodoMapper {
    int insert(Todo todo);
    List<Todo> findAll();
    int update(Todo todo);
    int deleteOneById(Integer todoId);
    int deleteAllByIds(List<Integer> todoIds);
}
