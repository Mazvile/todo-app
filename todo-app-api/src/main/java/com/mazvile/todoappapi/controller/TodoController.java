package com.mazvile.todoappapi.controller;

import com.mazvile.todoappapi.models.Todo;
import com.mazvile.todoappapi.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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

}
