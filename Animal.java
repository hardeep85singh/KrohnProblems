package com.elm.cefa.dining.krohnEducationAdvancedProblems;

public abstract class Animal {
    private int age;
    private int weight;

    public Animal() {
        age = 0;
        weight = 0;
    }

    public Animal(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public abstract void speak();

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return String.format("Age: %d%nWeight: %d%n", this.age, this.weight);
    }

}