package pl.javastart.task;

public class Circle {
    private int r;

    public Circle(int r) {
        this.r = r;

    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }


    double calculateCircleArea(Circle circle) {

        return Math.pow(circle.getR(), 2);
    }

}
