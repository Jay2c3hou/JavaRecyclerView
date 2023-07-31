package com.example.recyclerview;

public class Person {
    private String name;
    private String number;
    private int headId;

    public Person(String name, String number, int headId) {
        this.name = name;
        this.number = number;
        this.headId = headId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getHeadId() {
        return headId;
    }

    public void setHeadId(int headId) {
        this.headId = headId;
    }
}
