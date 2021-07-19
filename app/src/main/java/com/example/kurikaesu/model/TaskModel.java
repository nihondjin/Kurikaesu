package com.example.kurikaesu.model;

import java.io.Serializable;

public class TaskModel implements Serializable {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TaskModel(String title) {
        this.title = title;
    }

    private String title;
}
