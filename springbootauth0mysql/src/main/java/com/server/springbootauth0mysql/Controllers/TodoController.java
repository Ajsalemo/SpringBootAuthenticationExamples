package com.server.springbootauth0mysql.Controllers;

import javax.persistence.EntityNotFoundException;

import com.server.springbootauth0mysql.Entities.Todos;
import com.server.springbootauth0mysql.Repository.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TodoController {
    @Autowired
    private TodoRepository todoRepository;

    // Get all todos
    @GetMapping("/get_todo")
    public Iterable<Todos> getTodos() {
        return todoRepository.findAll();
    }

    // Find a todo by ID
    @GetMapping("/todo/{id}")
    public Todos findTodoById(@PathVariable Long id) {
        return todoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Unable to find Todo Id: " + id));
    }
}
