package src.Lab5;

import java.util.Scanner;

public class Ex5_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num, count = 1;

        System.out.print("Enter Number : ");
        num = scan.nextInt();

        for (int i = 1 ; i <= num ; i++){
            count *= i;
            if (i == 1){
                System.out.print(i);
            }
            else{
                System.out.print("*" + i);
            }
        }
        System.out.println(" = " + count);
    }
}
