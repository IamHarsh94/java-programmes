package com.bridgelabz.programs;

import java.util.Scanner;

public class CalenderProgram { 
    /**
     * @param To accept the month,day and year and return day of the week by standard formula.
     */
    public static int day(int month, int day, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + (31*m)/12) % 7;
        return d;
    }
    /**
     * To print the calender by calculating day of the week.
     */
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter month");
    	int month = sc.nextInt(); 
         System.out.println("Enter year"); 
        int year = sc.nextInt(); 
       
        String[] months = {"","Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nove","Dec"};

        int[] days = {
            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        
        
        System.out.println("****** "+ months[month] + " "+ year+" ********");
        System.out.println(" S  M  T  W  T  F  S");
        int d = day(month, 1, year);
        for (int i = 0; i <d; i++) {
            System.out.print("   ");
            
        }   
        for (int i = 1; i <=days[month]; i++) {
            System.out.printf("%2d ", i);
            
          if (((i + d) % 7 == 0)) { 
            	System.out.println();
          }
        } 
    }
}

