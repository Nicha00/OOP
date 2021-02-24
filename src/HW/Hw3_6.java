package src.HW;

import java.util.Scanner;

public class Hw3_6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int month;

        System.out.println("==================================================================");
        System.out.println("                               Month                              ");
        System.out.println("==================================================================");
        System.out.print("Input day : ");
        month = scan.nextInt();

        if(month == 30){
            System.out.println("==================================================================");
            System.out.println("Have a month April, June, September, November");
            System.out.println("==================================================================");
        }
        else if(month == 31){
            System.out.println("==================================================================");
            System.out.println("Have a month January, March, May, July, August, October, December");
            System.out.println("==================================================================");
        }
        else if(month == 28){
            System.out.println("==================================================================");
            System.out.println("Have a month February");
            System.out.println("==================================================================");
        }
        else if(month == 29){
            System.out.println("==================================================================");
            System.out.println("Have a month February");
            System.out.println("==================================================================");
        }
        else {
            System.out.println("==================================================================");
            System.out.println("Con't be displayed invalid information provided!!!");
            System.out.println("==================================================================");
        }
    }
}
