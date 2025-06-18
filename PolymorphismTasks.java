// 1. Shape Area Calculation using Polymorphism
abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;
    Circle(double r) { radius = r; }
    double area() { return Math.PI * radius * radius; }
}

class Rectangle extends Shape {
    double length, width;
    Rectangle(double l, double w) { length = l; width = w; }
    double area() { return length * width; }
}

class Triangle extends Shape {
    double base, height;
    Triangle(double b, double h) { base = b; height = h; }
    double area() { return 0.5 * base * height; }
}

// 2. E-commerce Payment Processing
abstract class PaymentMethod {
    abstract void processPayment();
}

class CreditCard extends PaymentMethod {
    void processPayment() { System.out.println("Processing credit card payment"); }
}

class PayPal extends PaymentMethod {
    void processPayment() { System.out.println("Processing PayPal payment"); }
}

class BankTransfer extends PaymentMethod {
    void processPayment() { System.out.println("Processing bank transfer payment"); }
}

// 3. Vehicle Rental System
abstract class Vehicle {
    abstract double calculateRent(int days);
}

class Car extends Vehicle {
    double calculateRent(int days) { return days * 50.0; }
}

class Motorcycle extends Vehicle {
    double calculateRent(int days) { return days * 30.0; }
}

class Bicycle extends Vehicle {
    double calculateRent(int days) { return days * 10.0; }
}

// 4. Restaurant Ordering System
abstract class MenuItem {
    abstract void prepare();
}

class Appetizer extends MenuItem {
    void prepare() { System.out.println("Preparing appetizer..."); }
}

class MainCourse extends MenuItem {
    void prepare() { System.out.println("Cooking main course..."); }
}

class Beverage extends MenuItem {
    void prepare() { System.out.println("Serving beverage..."); }
}

// 5. Shape Manipulation Application
abstract class ShapeManipulation {
    abstract void resize();
    abstract void rotate();
}

class ManipulateCircle extends ShapeManipulation {
    void resize() { System.out.println("Resizing circle"); }
    void rotate() { System.out.println("Rotating circle"); }
}

class ManipulateSquare extends ShapeManipulation {
    void resize() { System.out.println("Resizing square"); }
    void rotate() { System.out.println("Rotating square"); }
}

class ManipulateTriangle extends ShapeManipulation {
    void resize() { System.out.println("Resizing triangle"); }
    void rotate() { System.out.println("Rotating triangle"); }
}

// 6. Calculator with Overloaded Methods
class Calculator {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
}

// 7. Geometry with Overloaded Methods
class Geometry {
    double calculateArea(double radius) { return Math.PI * radius * radius; }
    double calculateArea(double length, double width) { return length * width; }
    double calculateArea(double base, double height, boolean type) { return 0.5 * base * height; }
}

// 8. Payroll System
class Employee {
    double calculateSalary() { return 30000; }
}

class Manager extends Employee {
    double calculateSalary() { return super.calculateSalary() + 10000; }
}

// 9. Banking Application
class Account {
    double calculateInterest() { return 0; }
}

class SavingsAccount extends Account {
    double calculateInterest() { return 500; }
}

class FixedDepositAccount extends Account {
    double calculateInterest() { return 1000; }
}

// 10. Game Character Attack
class Character {
    void attack() { System.out.println("Basic attack"); }
}

class Warrior extends Character {
    void attack() { System.out.println("Warrior strikes with sword"); }
}

class Mage extends Character {
    void attack() { System.out.println("Mage casts a fireball"); }
}

// 11. Music Application
abstract class Instrument {
    abstract void playSound();
}

class Piano extends Instrument {
    void playSound() { System.out.println("Piano is playing"); }
}

class Guitar extends Instrument {
    void playSound() { System.out.println("Guitar is strumming"); }
}

class Violin extends Instrument {
    void playSound() { System.out.println("Violin is playing melody"); }
}

// Main class for sample execution
public class PolymorphismTasks {
    public static void main(String[] args) {
        Shape shape = new Circle(5);
        System.out.println("Area: " + shape.area());

        PaymentMethod payment = new PayPal();
        payment.processPayment();

        Vehicle vehicle = new Car();
        System.out.println("Rent: " + vehicle.calculateRent(3));

        MenuItem item = new Beverage();
        item.prepare();

        ShapeManipulation sm = new ManipulateSquare();
        sm.resize(); sm.rotate();

        Calculator calc = new Calculator();
        System.out.println("Add: " + calc.add(5, 10));

        Geometry geo = new Geometry();
        System.out.println("Area: " + geo.calculateArea(5.0));

        Employee emp = new Manager();
        System.out.println("Salary: " + emp.calculateSalary());

        Account acc = new FixedDepositAccount();
        System.out.println("Interest: " + acc.calculateInterest());

        Character player = new Mage();
        player.attack();

        Instrument inst = new Guitar();
        inst.playSound();
    }
}
