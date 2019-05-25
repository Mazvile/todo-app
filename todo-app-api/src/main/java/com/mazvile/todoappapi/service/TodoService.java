package com.mazvile.todoappapi.service;

import com.mazvile.todoappapi.models.Todo;
import com.mazvile.todoappapi.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public Todo createTodo(Todo todo) {
        return repository.save(new Todo(todo.getTitle()));
    }

    public List<Todo> getAllTodos() {
        Iterable<Todo> itrTodos = repository.findAll();
        List<Todo> todos = new ArrayList<>();
        for (Todo todo : itrTodos) {
            todos.add(todo);
        }
        return todos;
    }

    public Todo updateTodo(Todo updateTodo) {
        return repository.save(updateTodo);
    }
}
