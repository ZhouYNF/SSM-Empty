package com.zhou.todo.dao;

import com.zhou.todo.entity.Todo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Todo record);

    Todo selectByPrimaryKey(Integer id);

    List<Todo> selectAll();

    int updateByPrimaryKey(Todo record);
}