package com.zhou.todo.controller;

import com.zhou.config.RootConfig;
import com.zhou.todo.entity.Todo;
import com.zhou.todo.service.TodoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = RootConfig.class)
public class TodoControllerTest {
    @Autowired
    TodoService todoService;

    @Test
    public void selectAll() {
        List<Todo> list = todoService.selectAll();
        for (Todo todo : list) {
            System.out.println(todo);
        }
    }
}