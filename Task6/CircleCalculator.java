package labtask;

import javax.swing.JOptionPane;

public class CircleCalculator {
    public static void main(String[] args) {

        String radiusInput = JOptionPane.showInputDialog("Enter the radius of the circle:");
        int radius = Integer.parseInt(radiusInput);


        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;


        String message = String.format("Circumference: %.2f\nArea: %.2f", circumference, area);
        JOptionPane.showMessageDialog(null, message);
    }
}