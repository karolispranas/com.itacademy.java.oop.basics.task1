package Task1;

public class ShapeApplication {

    public static void main(String[] args) {

        Shape square = new Square(10);
        Shape circle = new Circle(5);

        square.print(square.calculatePerimeter(), square.calculateArea());
        circle.print(circle.calculatePerimeter(), circle.calculateArea());

    }
}
