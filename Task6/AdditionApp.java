package labtask;


import javax.swing.JOptionPane;

public class AdditionApp {
    public static void main(String[] args) {

        String input1 = JOptionPane.showInputDialog("Enter the first integer:");
        int num1 = Integer.parseInt(input1);
        String input2 = JOptionPane.showInputDialog("Enter the second integer:");
        int num2 = Integer.parseInt(input2);


        int sum = num1 + num2;


        JOptionPane.showMessageDialog(null, "Sum: " + sum);
    }
}