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

    private String text;

    private boolean isCompleted;

    private Todo() {
    }

    public Todo(String text) {
        this.text = text;
        this.isCompleted = false;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", isCompleted=" + isCompleted +
                '}';
    }
}