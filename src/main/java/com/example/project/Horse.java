package com.example.project;

public class Horse  {
    private String name;
    private int weight;

    public Horse(String name, int weight) {
        //implement here
        this.name = name;
        this.weight = weight;
    }

    /** @return the horse's name */
    public String getName() {
        return name;
    }

    /** @return the horse's weight */
    public int getWeight() {
        return weight;
    }

    /** @return a printable String of the Horse -> name: Cathy weight: 1500*/
    public String horseInfo() {
        return "name: " + name + ", weight: " + weight;
    }
}


 
 


