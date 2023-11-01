import java.util.Scanner;

abstract class Figure {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle: length = " + length + ", width = " + width;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle rectangle = (Rectangle) obj;
        return Double.compare(rectangle.length, length) == 0 && Double.compare(rectangle.width, width) == 0;
    }
}

class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle: radius = " + radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle circle = (Circle) obj;
        return Double.compare(circle.radius, radius) == 0;
    }
}

class Trapezium extends Figure {
    private double base1;
    private double base2;
    private double height;
    private double side1;
    private double side2;

    public Trapezium(double base1, double base2, double height, double side1, double side2) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    double calculateArea() {
        return (base1 + base2) * height / 2;
    }

    @Override
    double calculatePerimeter() {
        return base1 + base2 + side1 + side2;
    }

    @Override
    public String toString() {
        return "Trapezium: base1 = " + base1 + ", base2 = " + base2 + ", height = " + height +
                ", side1 = " + side1 + ", side2 = " + side2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Trapezium trapezium = (Trapezium) obj;
        return Double.compare(trapezium.base1, base1) == 0 && Double.compare(trapezium.base2, base2) == 0 &&
                Double.compare(trapezium.height, height) == 0 && Double.compare(trapezium.side1, side1) == 0 &&
                Double.compare(trapezium.side2, side2) == 0;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length and width of the rectangle: ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        Figure rectangle = new Rectangle(length, width);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        Figure circle = new Circle(radius);

        System.out.print("Enter the base1, base2, height, side1, and side2 of the trapezium: ");
        double base1 = scanner.nextDouble();
        double base2 = scanner.nextDouble();
        double height = scanner.nextDouble();
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        Figure trapezium = new Trapezium(base1, base2, height, side1, side2);

        Figure[] figures = {rectangle, circle, trapezium};

        for (Figure figure : figures) {
            System.out.println("Area: " + figure.calculateArea());
            System.out.println("Perimeter: " + figure.calculatePerimeter());
            System.out.println(figure);
            System.out.println();
        }
    }
}
