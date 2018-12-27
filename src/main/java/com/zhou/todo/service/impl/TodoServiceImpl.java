package com.zhou.todo.service.impl;

import com.zhou.todo.dao.TodoMapper;
import com.zhou.todo.entity.Todo;
import com.zhou.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    TodoMapper todoMapper;

    @Override
    public List<Todo> selectAll() {
        return todoMapper.selectAll();
    }
}
