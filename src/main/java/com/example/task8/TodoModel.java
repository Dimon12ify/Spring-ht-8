package com.example.task8;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TodoModel {
    private String name;
    private List<String> events;

    public TodoModel(String name, List<String> events) {
        this.name = name;
        this.events = events;
    }

    public static TodoModel toModel(Todo todo) {
        return new TodoModel(todo.getName(), todo.getEvents());
    }
}
