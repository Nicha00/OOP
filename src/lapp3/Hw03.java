package src.lapp3;
//รับเลขแค่ 4 หลัก และมีช่องว่างคั่น

import java.util.Scanner;

public class Hw03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number : ");
        String mystr = scan.nextLine(); 
        System.out.println(mystr.substring(0,1) + " " + mystr.substring(1,2) + " " + mystr.substring(2,3) + " " + mystr.substring(3));
    }
}
