package com.elm.cefa.dining.krohnEducationAdvancedProblems;

public class Owl extends Animal {

    private String name;

    public Owl() {
        super();
        name = "";
    }

    public Owl(String name, int age, int weight) {
        super(age, weight);
        this.name = name;
    }

    public void speak() {
        System.out.println("Hoo Hoo");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("Owl: %nName: %s%n", getName() + super.toString());
    }

}