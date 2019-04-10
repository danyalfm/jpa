package com.uabc.database.example.examplejpa.jpa.model;

import lombok.Data;

@Data
public class LogModel {
    private int id;
    private String date;
    private String details;
    private String username;
    private String url;

    public LogModel() {

    }
}
