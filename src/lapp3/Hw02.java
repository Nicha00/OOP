package src.lapp3;
//หาเงินฝากจำนวน 5 ปั
import java.util.Scanner;

public class Hw02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Principal : ");
        int P = scan.nextInt();

        System.out.print("Enter Interate : ");
        int I = scan.nextInt();

        int Y1 = P + (P/I);
        int Y2 = Y1 + (Y1/I);
        int Y3 = Y2 + (Y2/I);
        int Y4 = Y3 + (Y3/I);
        int Y5 = Y4 + (Y4/I);

        System.out.println("Year 1 " + Y1 + " Bath");
        System.out.println("Year 2 " + Y2 + " Bath");
        System.out.println("Year 3 " + Y3 + " Bath");
        System.out.println("Year 4 " + Y4 + " Bath");
        System.out.println("Year 5 " + Y5 + " Bath");
    }
}
