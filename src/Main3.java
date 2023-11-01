import java.util.Scanner;

interface Figure02 {
    double calculateArea();
    double calculatePerimeter();
}

class Rectangle02 implements Figure02 {
    private double length;
    private double width;

    public Rectangle02(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle02: length = " + length + ", width = " + width;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle02 rectangle = (Rectangle02) obj;
        return Double.compare(rectangle.length, length) == 0 && Double.compare(rectangle.width, width) == 0;
    }
}

class Circle02 implements Figure02 {
    private double radius;

    public Circle02(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle02: radius = " + radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle02 circle = (Circle02) obj;
        return Double.compare(circle.radius, radius) == 0;
    }
}

class Trapezium02 implements Figure02 {
    private double base1;
    private double base2;
    private double height;
    private double side1;
    private double side2;

    public Trapezium02(double base1, double base2, double height, double side1, double side2) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calculateArea() {
        return (base1 + base2) * height / 2;
    }

    @Override
    public double calculatePerimeter() {
        return base1 + base2 + side1 + side2;
    }

    @Override
    public String toString() {
        return "Trapezium02: base1 = " + base1 + ", base2 = " + base2 + ", height = " + height +
                ", side1 = " + side1 + ", side2 = " + side2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Trapezium02 trapezium = (Trapezium02) obj;
        return Double.compare(trapezium.base1, base1) == 0 && Double.compare(trapezium.base2, base2) == 0 &&
                Double.compare(trapezium.height, height) == 0 && Double.compare(trapezium.side1, side1) == 0 &&
                Double.compare(trapezium.side2, side2) == 0;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length and width of the rectangle: ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        Figure02 rectangle = new Rectangle02(length, width);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        Figure02 circle = new Circle02(radius);

        System.out.print("Enter the base1, base2, height, side1, and side2 of the trapezium: ");
        double base1 = scanner.nextDouble();
        double base2 = scanner.nextDouble();
        double height = scanner.nextDouble();
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        Figure02 trapezium = new Trapezium02(base1, base2, height, side1, side2);

        Figure02[] figures = {rectangle, circle, trapezium};

        for (Figure02 figure : figures) {
            System.out.println("Area: " + figure.calculateArea());
            System.out.println("Perimeter: " + figure.calculatePerimeter());
            System.out.println(figure);
            System.out.println();
        }
    }
}
