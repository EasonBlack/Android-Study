package com.example.eason.mydemo;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private int imageId;
    private String desc;

    public Person(String name, int imageId, String desc) {
        this.name = name;
        this.imageId = imageId;
        this.desc = desc;
    }

    public static List<Person> getAllPersons() {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("aaa", R.drawable.a, "this is a"));
        persons.add(new Person("bbb", R.drawable.b, "this is b"));
        persons.add(new Person("ccc", R.drawable.c, "this is c"));


        return persons;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

    public String getDesc() {
        return desc;
    }
}