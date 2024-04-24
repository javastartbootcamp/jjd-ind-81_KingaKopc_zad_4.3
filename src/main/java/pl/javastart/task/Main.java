package pl.javastart.task;

public class Main {
    public static void main(String[] args) {

        Square square = new Square(5);
        double squareArea = square.calculateSquareArea(square);
        System.out.println("pole kwadratu wynosi : " + squareArea);

        Circle circle = new Circle(3);
        double circleArea = circle.calculateCircleArea(circle);
        System.out.println("Pole koła wynosi : " + circleArea);

        Triangle triangle = new Triangle(1, 2, 3);
        double trianglePerimeter = triangle.calculateTrianglePerimeter(triangle);
        System.out.println("Obwód trójkąta wynosi : " + trianglePerimeter);

        Rectangle rectangle = new Rectangle(1, 2);
        double rectPerimeter = rectangle.calculateRectPerimeter(rectangle);
        System.out.println("Obwód prostokąta wynosi :  " + rectPerimeter);
    }
}
//Wydaje mi się, że w 2 cześci zadania powinnam zastosować settery, ale nw jak?