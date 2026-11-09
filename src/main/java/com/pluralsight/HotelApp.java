package com.pluralsight;

public class HotelApp {


        public static void main(String[] args) {

            // Create a reservation
            Reservation reservation = new Reservation("double", 3, true);

            // Display reservation information
            System.out.println("Room Type: " + reservation.getRoomType());

            System.out.println("Price per Night: $" + reservation.getPrice());

            System.out.println("Number of Nights: " + reservation.getNumberOfNights());

            System.out.println("Weekend: " + reservation.isWeekend());

            System.out.println("Reservation Total: $" + reservation.getReservationTotal());
        }
    }

