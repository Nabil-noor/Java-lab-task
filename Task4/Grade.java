package labtask;



import java.util.Scanner;

class Grade {
    private String name;
    private int roll;
    private double[] marks;
    private String grade;


    public Grade(String name, int roll, double[] marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
        this.grade = calculateGrade();
    }


    private double calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }


    private String calculateGrade() {
        double avgMarks = calculateAverage();
        if (avgMarks >= 80) return "A+";
        else if (avgMarks >= 75) return "A";
        else if (avgMarks >= 70 ) return "B+";
        else if (avgMarks >= 65) return "B";
        else if (avgMarks >= 60) return "C+";
        else if (avgMarks >= 50) return "C";
        else if (avgMarks >= 40) return "D";
        else return "F";
    }


    public void display() {
        System.out.println("\nStudent Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.print("Marks: ");
        for (double mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nAverage Marks: " + calculateAverage());
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();

        double[] studentMarks = new double[4];

        System.out.println("Enter marks for 3 subjects:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Subject " + (i + 1) + " Marks: ");
            studentMarks[i] = scanner.nextDouble();
        }

        // Creating an object of Grade class
        Grade student = new Grade(studentName, rollNumber, studentMarks);

        // Displaying student details and grade
        student.display();

        scanner.close();
    }
}
