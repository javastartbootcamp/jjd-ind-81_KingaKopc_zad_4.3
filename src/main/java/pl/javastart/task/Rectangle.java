package pl.javastart.task;

public class Rectangle {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {

        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {

        return b;
    }

    public void setB(double b) {

        this.b = b;
    }


    double calculateRectPerimeter(Rectangle rectangle) {

        return 2 * rectangle.getA() + 2 * rectangle.getB();
    }

}
