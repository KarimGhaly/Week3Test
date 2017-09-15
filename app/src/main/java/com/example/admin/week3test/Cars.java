package com.example.admin.week3test;

/**
 * Created by Admin on 9/15/2017.
 */

public class Cars {
    String Model;
    String Type;
    int Year;

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public Cars(String model, String type, int year) {

        Model = model;
        Type = type;
        Year = year;
    }
}
