package labtask;


import javax.swing.JOptionPane;

public class TriangleArea {
    public static void main(String[] args) {

        String aInput = JOptionPane.showInputDialog("Enter side a:");
        double a = Double.parseDouble(aInput);
        String bInput = JOptionPane.showInputDialog("Enter side b:");
        double b = Double.parseDouble(bInput);
        String cInput = JOptionPane.showInputDialog("Enter side c:");
        double c = Double.parseDouble(cInput);


        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Display result
        JOptionPane.showMessageDialog(null, "Area of the triangle: " + area);
    }
}