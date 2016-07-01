package com.udacity.jokesbackend;

/** The object model for the data we are sending through endpoints */
public class MyJokes {

    private String myData;

    public String getData() {
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }
}