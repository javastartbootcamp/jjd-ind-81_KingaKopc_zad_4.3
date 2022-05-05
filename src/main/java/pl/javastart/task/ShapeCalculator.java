package pl.javastart.task;

public class ShapeCalculator {
    double calculateSquareArea(Square square) {
        return Math.pow(square.getA(), 2);
    }

    double calculateCircleArea(Circle circle) {
        return Math.pow(circle.getR(), 2);
    }

    double calculateTrianglePerimeter(Triangle triangle) {
        return triangle.getA() + triangle.getB() + triangle.getC();
    }

    double calculateRectPerimeter(Rectangle rectangle) {
        return 2 * rectangle.getA() + 2 * rectangle.getB();
    }

}
