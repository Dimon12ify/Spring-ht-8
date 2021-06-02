package com.example.task8;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ElementCollection
    private List<String> events;
}
