package com.ayush.ToDoSpring;


import org.springframework.stereotype.Service;

@Service("anotherToDoService")
public class AnotherToDoService implements ToDoService{
    @Override
    public String doSomething() {
        return "In Another ToDo Service";
    }
}
