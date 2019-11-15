package com.md.animal;

public class Cat extends Animal {

    /**
     * Constructor for Cat
     *
     * @param name   Name of the animal
     * @param weight Weight of the animal
     */
    public Cat(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void sound() {
        System.out.println("meow");
    }

    @Override
    public void type() {
        System.out.println("Cat");
    }
}
