package com.example.demoApi;
public class Todo {
    private int userId;
    private int id;
    private String title;
    private boolean completed;

    // Default constructor
    public Todo( ) {


    }

    // Parameterized constructor
    public Todo(int userId, int id, String title, boolean completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    // Getters and Setters
    public int getUserId() { // Correct method declaration with return type int
        return userId;
    }

    public void setUserId(int userId) { // Correct method declaration with return type void
        this.userId = userId;
    }

    public int getId() { // Correct method declaration with return type int
        return id;
    }

    public void setId(int id) { // Correct method declaration with return type void
        this.id = id;
    }

    public String getTitle() { // Correct method declaration with return type String
        return title;
    }

    public void setTitle(String title) { // Correct method declaration with return type void
        this.title = title;
    }

    public boolean isCompleted() { // Correct method declaration with return type boolean
        return completed;
    }

    public void setCompleted(boolean completed) { // Correct method declaration with return type void
        this.completed = completed;
    }

    // Override toString for easy debugging
    @Override
    public String toString() {
        return "Todo{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }
}
