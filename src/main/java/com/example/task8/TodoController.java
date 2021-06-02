package com.example.task8;

import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("todo")
public class TodoController {
    private TodoServices services;

    public TodoController(TodoServices services) {
        this.services = services;
    }

    @GetMapping
    public List<TodoModel> Todos() {
        return services.GetAllTodos().stream().map(f -> TodoModel.toModel(f)).collect(Collectors.toList());
    }

    @PostMapping
    public void AddTodo(@RequestBody Todo todo) {
        services.AddTodo(todo);
    }

}
