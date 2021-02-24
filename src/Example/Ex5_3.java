package src.Example;
import java.util.Scanner;

public class Ex5_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Guest my Word");
        System.out.println();

        String word = "S", end;

        do{
            System.out.print("Enter your Char : ");
            end = scan.nextLine();
        } while (!end.equals(word));
    }
}