package com.mazvile.todoappapi.controller;

import com.mazvile.todoappapi.models.Todo;
import com.mazvile.todoappapi.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoService service;

    @PostMapping
    public Todo createTodo(@RequestBody Todo newTodo) {
        return service.createTodo(newTodo);
    }

    @GetMapping
    public List<Todo> getAllTodos() {
        return service.getAllTodos();
    }

    @PutMapping("/{todoId}")
    public Todo updateTodo(@PathVariable(value = "todoId") String id, @RequestBody Todo updateTodo) {
        return service.updateTodo(updateTodo);
    }

    @DeleteMapping("/{todoId}")
    public Todo deleteTodo(@PathVariable(value = "todoId") String id) {
        return service.deleteTodo(Long.parseLong(id));
    }

}
