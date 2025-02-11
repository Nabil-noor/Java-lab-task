package labtask;

class Triangle {
    private double height;
    private double base;
    public Triangle(double h, double b) {
        this.height = h;
        this.base = b;
    }


    public void setHeight(double h) {
        this.height = h;
    }


    public double getHeight() {
        return height;
    }


    public void setBase(double b) {
        this.base = b;
    }


    public double getBase() {
        return base;
    }


    public double getArea() {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Triangle t = new Triangle(10, 5);
        System.out.println("Triangle Area: " + t.getArea());

        t.setHeight(15);
        t.setBase(7);
        System.out.println("Updated Triangle Area: " + t.getArea());
    }
}
