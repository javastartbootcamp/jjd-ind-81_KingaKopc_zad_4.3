package pl.javastart.task;

public class Square {
    private double a;

    public Square(double a) {

        this.a = a;
    }


    public double getA() {

        return a;
    }

    public void setA(double a) {

        this.a = a;
    }


    double calculateSquareArea(Square square) {

        return Math.pow(getA(), 2);
    }


}
