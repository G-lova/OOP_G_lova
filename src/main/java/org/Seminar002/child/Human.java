package org.Seminar002.child;

import org.Seminar002.parent.Diseaseable;

public class Human implements Diseaseable {
    private final String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void getIll() {
        System.out.printf("%s %s заболел простудой", getType(), getName());
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }
}

