package com.mazvile.todoappapi.models;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
public class Todo {

    @Id
    @GeneratedValue
    private long id;

    private String title;

    private boolean completed;

    private Todo() {
    }

    public Todo(String title) {
        this.title = title;
        this.completed = false;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }
}