package src.lapp3;
//เอาการทดลอง 3_8 เปลี่ยนเป็นเรียกใช้งานผ่านตัวแปร obj or instant
import java.util.Scanner;

public class Hw04 {

    String message;
    float salary;

    public Hw04 (float hours, float rate){
        message = "Salary";
        salary = (hours <= 40) ? (hours*rate):
        (rate * (1.5f * hours - 20));
    }

    public static void main(String[] args) {
        float h,r;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter hours work : ");
        h = scan.nextFloat();
        System.out.print("Enter hourly rate : ");
        r = scan.nextFloat();

        Hw04 ss = new Hw04(h, r);
        System.out.print("Calculate Area " + ss.message);
        System.out.println(" = " + ss.salary);
    }
    
}
