package com.ayush.ToDoSpring;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ToDoController {

    private static List<ToDo> todoList;

    public ToDoController(){
        todoList = new ArrayList<>();
        todoList.add(new ToDo(1,false,"Todo 1",1));
        todoList.add(new ToDo(2,false,"Todo 2",2));
        todoList.add(new ToDo(3,false,"Todo 3",3));


    }

    @GetMapping("/todos")
    public List<ToDo> getTodos(){
        return todoList;
    }

    @PostMapping("/todos")
    public ToDo createTodo(@RequestBody ToDo newTodo){
        todoList.add(newTodo);
        return newTodo;
    }


}
