package pl.javastart.task;

public class Main {
    public static void main(String[] args) {

        Square square = new Square(5);
        ShapeCalculator calc = new ShapeCalculator();
        double squareArea = calc.calculateSquareArea(square);
        System.out.println("pole kwadratu wynosi : " + squareArea);

        Circle circle = new Circle(3);
        double circleArea = calc.calculateCircleArea(circle);
        System.out.println("Pole koła wynosi : " + circleArea);

        Triangle triangle = new Triangle(1, 2, 3);
        double trianglePerimeter = calc.calculateTrianglePerimeter(triangle);
        System.out.println("Obwód trójkąta wynosi : " + trianglePerimeter);

        Rectangle rectangle = new Rectangle(1, 2);
        double rectPerimeter = calc.calculateRectPerimeter(rectangle);
        System.out.println("Obwód prostokąta wynosi :  " + rectPerimeter);
    }
}
