package labtask.Library;

public class Teacher extends User {
    public Teacher(String name) {
        super(name, 3);
    }

    @Override
    public double calculateLateFee(Book book, int daysLate) {
        return 0; // No late fee
    }
}

