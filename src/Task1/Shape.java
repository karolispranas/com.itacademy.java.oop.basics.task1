package Task1;

public abstract class Shape {
    abstract double calculateArea();

    abstract double calculatePerimeter();

    public void print(double perimeter, double area) {
        System.out.println("Perimeter: " + perimeter + " ,area: " + area);
    }

}
