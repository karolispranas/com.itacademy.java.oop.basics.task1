package Task1;

public class Circle extends Shape {
    private double radius;
    private double area;
    private double perimeter;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    @Override
    double calculateArea() {
        this.area = Math.PI * (radius * radius);
        return area;
    }

    @Override
    double calculatePerimeter() {
        this.perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

}
