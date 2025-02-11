package labtask;


class Grade1 {
    private String name;
    private int roll;
    private double[] marks;
    private String grade; 

    
    public Grade1(String name, int roll, double[] marks) {
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
        if (avgMarks >= 95) return "A+";
        else if (avgMarks >= 75) return "A";
        else if (avgMarks >= 70) return "B+";
        else if (avgMarks >= 65) return "B";
        else if (avgMarks >= 60) return "C+";
        else if (avgMarks >= 50) return "C";
        else if (avgMarks >= 40) return "D";
        else return "F";
    }

    
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.print("Marks: ");
        for (double mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nAverage Marks: " + calculateAverage());
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        
        String studentName = "nabil";
        int rollNumber = 101;
        double[] studentMarks = {80, 77, 60, 80, 61}; 

        
        Grade student = new Grade(studentName, rollNumber, studentMarks);

        
        student.display();
    }
}
