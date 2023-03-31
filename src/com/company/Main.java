package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        ArrayList<Bus> buses=new ArrayList<Bus>();
        ArrayList<Booking>bookings=new ArrayList<Booking>();
        buses.add(new Bus(1,true,1));
        buses.add(new Bus(2,true,3));
        buses.add(new Bus(3,true,5));

        for (Bus buss: buses) {
           buss.businfo();
        }


         int input=1;

        while (input==1){
            System.out.println("press 1 to BOOKING ,press 2 to EXIT");
             input=scanner.nextInt();
            if (input == 1) {

               Booking booking=new Booking();
               if (booking.isAvilable(buses,bookings))
               {
                   bookings.add(booking);
                   System.out.println("booking confirmed...................");
               }
               else
                   System.err.println("sorry... bus is full");

            }
            else
                System.err.println("exit................");


        }
    }
}
