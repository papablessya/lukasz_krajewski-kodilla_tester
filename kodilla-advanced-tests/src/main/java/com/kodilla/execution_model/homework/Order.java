package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {
private String login;
private double value;
private LocalDate date;

    public Order(String login, double value, LocalDate date) {
        this.login = login;
        this.value = value;
        this.date = date;
    }

    public String getLogin() {
        return login;
    }

    public double getValue() {
        return value;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "login='" + login + '\'' +
                ", value=" + value +
                ", date=" + date +
                '}';
    }
}
