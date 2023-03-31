package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import  java.util.*;
public class Booking {
    String name;
    int busno;
    Date date;
 Booking(){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter passenger name ");
     name= sc.next();
     System.out.println("enter bus no");
     busno=sc.nextInt();
     System.out.println("enter date dd-MM-YYYY");
     String dateinput= sc.next();
     SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
     try {
         date=dateFormat.parse(dateinput);
     } catch (ParseException e) {
         e.printStackTrace();
     }

 }
  public  boolean  isAvilable(  ArrayList<Bus> buses, ArrayList<Booking>bookings){
     int capacity=0;
      for (Bus bus:buses) {
          if (bus.getNo()==busno)
              capacity=bus.getCab();
      }
      int booked=0;
      for (Booking b:bookings) {
        if (b.busno== busno && b.date.equals(date) ) {
            booked++;
        }
      }

     return   booked<capacity?true:false;
    }
}
