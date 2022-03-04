package Task1;

public class Square extends Shape {
    private double side;
    private double area;
    private double perimeter;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    @Override
    double calculateArea() {
        this.area = side * side;
        return area;
    }

    @Override
    double calculatePerimeter() {
        this.perimeter = side * 4;
        return perimeter;
    }


}
