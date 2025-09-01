package com.ayush.ToDoSpring;

import org.springframework.stereotype.Service;

@Service("fakeToDoService")
public class FakeToDoService implements ToDoService {

    @Override
    public String doSomething() {
        return "Something";
    }
}
