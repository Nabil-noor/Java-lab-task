package labtask;

import javax.swing.JOptionPane;

public class RectangleArea {
    public static void main(String[] args) {

        String breadthInput = JOptionPane.showInputDialog("Enter the breadth of the rectangle:");
        double breadth = Double.parseDouble(breadthInput);
        String heightInput = JOptionPane.showInputDialog("Enter the height of the rectangle:");
        double height = Double.parseDouble(heightInput);


        double area = breadth * height;

        JOptionPane.showMessageDialog(null, "Area: " + area);
    }
}
