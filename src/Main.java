import java.util.Scanner;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int studentID;

    public Student(String name, int age, int studentID) {
        super(name, age);
        this.studentID = studentID;
    }

    public void Show() {
        super.Show();
        System.out.println("Student ID: " + studentID);
    }
}

class Teacher extends Person {
    String department;

    public Teacher(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void Show() {
        super.Show();
        System.out.println("Department: " + department);
    }
}

class DepartmentHead extends Teacher {
    String position;

    public DepartmentHead(String name, int age, String department, String position) {
        super(name, age, department);
        this.position = position;
    }

    public void Show() {
        super.Show();
        System.out.println("Position: " + position);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення даних для студента
        System.out.print("Enter student's name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter student's age: ");
        int studentAge = scanner.nextInt();
        System.out.print("Enter student ID: ");
        int studentID = scanner.nextInt();
        scanner.nextLine();  // Очистка буфера

        // Введення даних для викладача
        System.out.print("Enter teacher's name: ");
        String teacherName = scanner.nextLine();
        System.out.print("Enter teacher's age: ");
        int teacherAge = scanner.nextInt();
        scanner.nextLine();  // Очистка буфера
        System.out.print("Enter department: ");
        String department = scanner.nextLine();

        // Введення даних для завідувача кафедри
        System.out.print("Enter department head's name: ");
        String headName = scanner.nextLine();
        System.out.print("Enter department head's age: ");
        int headAge = scanner.nextInt();
        scanner.nextLine();  // Очистка буфера
        System.out.print("Enter department: ");
        String headDepartment = scanner.nextLine();
        System.out.print("Enter position: ");
        String position = scanner.nextLine();

        // Створення об'єктів
        Student student = new Student(studentName, studentAge, studentID);
        Teacher teacher = new Teacher(teacherName, teacherAge, department);
        DepartmentHead departmentHead = new DepartmentHead(headName, headAge, headDepartment, position);

        // Виведення інформації про об'єкти
        System.out.println("\nStudent:");
        student.Show();

        System.out.println("\nTeacher:");
        teacher.Show();

        System.out.println("\nDepartment Head:");
        departmentHead.Show();
    }
}
