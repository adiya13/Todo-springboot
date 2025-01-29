package com.example.demoApi;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    private static List<Todo> todos;

    public TodoController() {
        todos = new ArrayList<>();
        todos.add(new Todo(1,1,"todo1",false));
        todos.add(new Todo(2,2,"todo2",true));
    }


}
