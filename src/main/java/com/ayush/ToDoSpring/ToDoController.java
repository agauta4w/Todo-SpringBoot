package com.ayush.ToDoSpring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/todos")
public class ToDoController {

    private ToDoService toDoService;  // for FakeToDOService
    private ToDoService toDoService2;
    private static List<ToDo> todoList;  // for ANothertodoservice
    private static final String TODO_NOT_FOUND = "todo not found";

    public ToDoController(@Qualifier("fakeToDoService")ToDoService toDoService,
                          @Qualifier("anotherToDoService")ToDoService toDoService2){
        this.toDoService = toDoService;
        this.toDoService2 = toDoService2;
        todoList = new ArrayList<>();
        todoList.add(new ToDo(1,false,"Todo 1",1));
        todoList.add(new ToDo(2,false,"Todo 2",2));
        todoList.add(new ToDo(3,false,"Todo 3",3));


    }

    @GetMapping("/")
    public ResponseEntity<List<ToDo>> getTodos(@RequestParam(required = false) boolean isCompleted){
        System.out.println("Incoming query Params : " + isCompleted);
       // return ResponseEntity.ok(todoList);
        return ResponseEntity.status(HttpStatus.OK).body(todoList);
    }

    @PostMapping("/")
  //  @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ToDo> createTodo(@RequestBody ToDo newTodo){
        todoList.add(newTodo);
        return ResponseEntity.status(HttpStatus.CREATED).body(newTodo);
    }

    @GetMapping("/{todoid}")
    public ResponseEntity<?> getTodoByID(@PathVariable Long todoid){
        for(ToDo todo : todoList) {
            if (todo.getId() == todoid) {
                return ResponseEntity.status(HttpStatus.OK).body(todo);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(TODO_NOT_FOUND);
    }



}
