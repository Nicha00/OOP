package src.lapp3;
import java.util.Scanner;
//แปลงจากเซลเซียสเป็นฟาเรนไฮต์

public class Hw01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter C : ");
        double c = input.nextDouble();
        double f = ((c*9)/5) + 32;
        System.out.print("อุณหภูมิ " + c + " เซลเซียส = " + f + " ฟาเรนไฮต์");
    }
}
