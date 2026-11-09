package com.pluralsight;

public class Reservation {

    //Instance variable (attributes)
    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    //create a constrctor

    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    //create getter , return the room type

    public String getRoomType() {
        return roomType;
    }

    //create setter to change the room type

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    //getter. calculates the price per night
    public double getPrice() {
        double price;
        if(roomType.equalsIgnoreCase("king")){
            price = 139.00;

        }else{
            price = 124.00;

        }
        //increase the price by 10% if it is a weekend
        if(weekend){
            price = price * 1.10;
        }
        return price;
    }
    //getter . return the number of nights
    public int getNumberOfNights() {
        return numberOfNights;
    }
    //setter , change the number of nights
    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    //getter . return whether the reservation includes a weekend
    public boolean isWeekend() {
        return weekend;
    }
    //setter , change the weeked status
    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    //calculates the total reservation
    public double getReservationTotal(){
        return getPrice() * numberOfNights;
    }
}
