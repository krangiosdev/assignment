package com.md.animal;

public class Dog extends Animal {

    /**
     * Constructor for Dog
     *
     * @param name   Name of the animal
     * @param weight Weight of the animal
     */
    public Dog(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void sound() {
        System.out.println("bark");
    }

    @Override
    public void type() {
        System.out.println("Dog");
    }
}
