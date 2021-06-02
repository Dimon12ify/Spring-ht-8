package com.example.task8;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TodoServices {
    private TodoRepository repository;

    public TodoServices(TodoRepository repository) {
        this.repository = repository;
    }

    public void AddTodo(Todo todo) {
        repository.save(todo);
    }

    public ArrayList<Todo> GetAllTodos() {
        return (ArrayList<Todo>) repository.findAll();
    }
}
