package com.ayush.ToDoSpring;

public class ToDo {

    private int id;
    private boolean completed;
    private String title;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id=" + id +
                ", completed=" + completed +
                ", title='" + title + '\'' +
                ", userId=" + userId +
                '}';
    }

    public ToDo(int id, boolean completed, String title, int userId) {
        this.id = id;
        this.completed = completed;
        this.title = title;
        this.userId = userId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    private int userId;
}
