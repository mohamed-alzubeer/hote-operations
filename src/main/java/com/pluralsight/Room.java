package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean Occupied;
    private boolean available;
    private boolean dirty;


    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return Occupied;
    }

    //return !dirty && occupied
    //full if statments
    public boolean isAvailable() {
        if (dirty == false && Occupied == false) {
            return true;
        }
        return true;
    }


    public boolean isDirty() {
        return dirty;
    }
}

