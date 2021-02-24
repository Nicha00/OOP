package src.HW;

import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        int choice;
        double width,length,base,height,area;
    
        System.out.println("1.Rectangle");
        System.out.println("2.Triangle");

        choice = scan.nextInt();

        switch (choice) {
            case 1 : 
                System.out.println("1.Rectangle");
                System.out.print("Input Width : ");
                width = scan.nextDouble();
      
                System.out.print("Input Long : ");
                length = scan.nextDouble();
                area = width * length;
           
                System.out.print("Area of Rectangle is "+ area);
                break;

            case 2 :
                System.out.print("2.Triangle");
                System.out.println("Input base : ");
                base = scan.nextDouble();

                System.err.print("Input height : ");
                height = scan.nextDouble();

                area = (base * height)/2 ;

                System.out.print("Area of a Triangle is "+ area);
                break;

            default :
                System.out.print("Don't have choice");
        }
    }
}
