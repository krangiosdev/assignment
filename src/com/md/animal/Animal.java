package com.md.animal;

/**
 * Animal class
 */
public abstract class Animal {

    //Name of the animal
    private String name;
    private int weight;

    /**
     * Constructor for Animal
     *
     * @param name   Name of the animal
     * @param weight Weight of the animal
     */
    Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Animal sound override in your implementation
     */
    public abstract void sound();

    /**
     * Additional method for future example
     */
    public abstract void type();
}
