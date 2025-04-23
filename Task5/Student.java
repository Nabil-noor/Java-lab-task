package labtask.Library;

public class Student extends User {
    public Student(String name) {
        super(name, 2);
    }

    @Override
    public double calculateLateFee(Book book, int daysLate) {
        if (book.type.equals("Printed")) {
            return 5 * daysLate * 0.5; // 50% discount
        }
        return 0;
    }
}
