package com.ayush.ToDoSpring;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ToDoController {

    private static List<ToDo> todos;

    public ToDoController(){
        todos = new ArrayList<>();
        todos.add(new ToDo(1,false,"Todo 1",1));
        todos.add(new ToDo(2,false,"Todo 2",2));
        todos.add(new ToDo(3,false,"Todo 3",3));


    }

}
