package src.HW;

import javax.swing.JOptionPane;

public class Hw5_1 {
    public static void main(String[] arges){
        double num;
        String numsub;
        numsub = JOptionPane.showInputDialog("Enter number of score :");
        num = Double.parseDouble(numsub);
        double score = getScore(num);
        double Average = average(num, score);
        String output = "Average score is"+Average;
        JOptionPane.showMessageDialog(null, output, "Result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    public static double getScore(Double num)
    {
        double sumtotal = 0;
        for(int i = 1 ;i <= num;i++){
            String number = JOptionPane.showInputDialog("Enter score "+i+":" );
            double num1 = Double.parseDouble(number);
            sumtotal += num1;
        }
        return (sumtotal);
    }
    public static double average(double num,double score){
        double total ;
        total = score/num;
        return (total);
    }
}
