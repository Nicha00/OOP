package src.HW;

import java.util.Scanner;

public class Hw3_5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    
        String name,surname; 
        double salary,bonus,total;

        System.out.println("==============================================");
        System.out.println("                     salary                   ");
        System.out.println("==============================================");
        System.out.print("Input Name : ");
        name = scan.nextLine();
        System.out.print("Input Surname : ");
        surname = scan.nextLine();
        System.out.print("Input Salary : ");
        salary = scan.nextInt();
        System.out.println("Name : " + name + " "+ surname + " have salary of " + salary + " Baht");
        System.out.println("==============================================");

        if(salary >= 0 && salary <= 15000){
            System.out.println("Your salary this year " + (salary * 12) + " Baht");
            total = salary * 12;
            System.out.println("Did not receive bonus!");
            System.out.println("==============================================");
        }
        else if(salary >= 15001 && salary <= 20000){
            System.out.println("Your salary this year " + (salary * 12) + " Baht");
            total = salary * 12;
            System.out.println("Your bonus this year " + (total * 0.07) + " Baht");
            bonus = total * 0.07;
            System.out.println("All total salary is " + (total + bonus) + " Baht");
            System.out.println("==============================================");
        }
        else if(salary >= 20001 && salary <= 30000){
            System.out.println("Your salary this year " + (salary * 12) + " Baht");
            total = salary * 12;
            System.out.println("Your bonus this year " + (total * 0.010) + " Baht");
            bonus = total * 0.10;
            System.out.println("All total salary is " + (total + bonus) + " Baht");
            System.out.println("==============================================");
        }
        else if(salary >= 30001 && salary <= 40000){
            System.out.println("Your salary this year " + (salary * 12) + " Baht");
            total = salary * 12;
            System.out.println("Your bonus this year " + (total * 0.12) + " Baht");
            bonus = total * 0.12;
            System.out.println("All total salary is " + (total + bonus) + " Baht");
            System.out.println("==============================================");
        }
        else if(salary >= 40001 && salary <= 60000){
            System.out.println("Your salary this year " + (salary * 12) + " Baht");
            total = salary * 12;
            System.out.println("Your bonus this year " + (total * 0.13) + " Baht");
            bonus = total * 0.13;
            System.out.println("All total salary is " + (total + bonus) + " Baht");
            System.out.println("==============================================");
        }
        else if(salary >= 60001 && salary <= 70000){
            System.out.println("Your salary this year " + (salary * 12) + " Baht");
            total = salary * 12;
            System.out.println("Your bonus this year " + (total * 0.14) + " Baht");
            bonus = total * 0.14;
            System.out.println("All total salary is " + (total + bonus) + " Baht");
            System.out.println("==============================================");
        }
        else{
            System.out.println("Your salary this year " + (salary * 12) + " Baht");
            total = salary * 12;
            System.out.println("Your bonus this year " + (total * 0.15) + " Baht");
            bonus = total * 0.15;
            System.out.println("All total salary is " + (total + bonus) + " Baht");
            System.out.println("==============================================");
        }
    }
}
