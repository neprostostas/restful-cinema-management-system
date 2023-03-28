package com.cinema.lab2.Classes;
import java.util.ArrayList;
import java.util.List;
/**
 * This class represents a Hall object with a name and capacity.
 * It also contains static methods for retrieving and manipulating all halls.
 */
public class Hall {
    private String name;
    private int capacity;
    private static final List<Hall> halls = new ArrayList<>();

    /**
     * Default constructor for Hall class
     */
    public Hall() {
    }

    /**
     * Constructs a Hall object with a specified name and capacity
     * @param name the name of the hall
     * @param capacity the maximum number of people the hall can hold
     */
    public Hall(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    /**
     * Getter method for name attribute
     * @return the name of the hall
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name attribute
     * @param name the new name of the hall
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for capacity attribute
     * @return the maximum number of people the hall can hold
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Setter method for capacity attribute
     * @param capacity the new maximum number of people the hall can hold
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Static method for retrieving all halls
     * @return a list of all halls
     */
    public static List<Hall> getAllHalls() {
        return halls;
    }

    /**
     * Static method for adding a new hall to the list of all halls
     * @param hall the new Hall object to add
     */
    public static void addHall(Hall hall) {
        halls.add(hall);
    }

    /**
     * Static method for updating a hall at a specified index in the list of all halls
     * @param index the index of the hall to update
     * @param hall the new Hall object to replace the old one with
     */
    public static void updateHall(int index, Hall hall) {
        halls.set(index, hall);
    }
}