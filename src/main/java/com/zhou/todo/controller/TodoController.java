package com.zhou.todo.controller;

import com.zhou.todo.entity.Todo;
import com.zhou.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {
    @Autowired
    TodoService todoService;

    @GetMapping
    @ResponseBody
    public List<Todo> selectAll() {
        return todoService.selectAll();
    }
}
