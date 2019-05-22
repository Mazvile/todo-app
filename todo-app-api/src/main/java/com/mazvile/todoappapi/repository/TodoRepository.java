package com.mazvile.todoappapi.repository;

import com.mazvile.todoappapi.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}