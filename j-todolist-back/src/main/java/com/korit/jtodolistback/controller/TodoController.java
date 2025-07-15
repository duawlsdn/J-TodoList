package com.korit.jtodolistback.controller;

import com.korit.jtodolistback.dto.ModifyReqDto;
import com.korit.jtodolistback.dto.RegisterReqDto;
import com.korit.jtodolistback.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;

    @PostMapping
    public ResponseEntity<?> register(@RequestBody RegisterReqDto dto) {
        System.out.println(dto);
        todoService.register(dto);
        return ResponseEntity.ok("등록 완료");
    }
    @GetMapping
    public ResponseEntity<?> getList() {
        return ResponseEntity.ok(todoService.getTodoList());
    }
    @PutMapping("/{todoId}")
    public ResponseEntity<?> modify(@PathVariable Integer todoId, @RequestBody ModifyReqDto dto) {
        System.out.println(todoId);
        System.out.println(dto);
        todoService.modify(todoId, dto);
        return ResponseEntity.ok("수정 완료");
    }
    @DeleteMapping("/{todoId}")
    public ResponseEntity<?> deleteOne(@PathVariable Integer todoId) {
        System.out.println(todoId);
        todoService.deleteOne(todoId);
        return ResponseEntity.ok("삭제 완료");
    }
    @DeleteMapping
    public ResponseEntity<?> deleteAll(@RequestBody List<Integer> todoIds) {
        System.out.println(todoIds);
        todoService.deleteAll(todoIds);
        return ResponseEntity.ok("삭제 완료");
    }
}
