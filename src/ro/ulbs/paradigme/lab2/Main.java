package ro.ulbs.paradigme.lab2;

import ro.ulbs.paradigme.lab3.util.PasswordMaker;

public class Main {
    public static void main(String[] args) {
        Triangle tri = new Triangle(1.1F, 2.0F, "red");
        Circle c = new Circle(1.5F, "yellow");
        Square sq = new Square(1.2F, "blue");

        System.out.println("Aria = " + tri.getArea() + " detalii: " + tri);
        System.out.println("Aria = " + c.getArea() + " detalii: " + c);
        System.out.println("Aria = " + sq.getArea() + " detalii: " + sq);

        Triangle tri2 = new Triangle(1.1F, 2.0F, "red");
        System.out.println("Triunghi2 este egal cu Triunghi1: " + tri.equals(tri2));

        Triangle tri3 = new Triangle(1.1F, 2.0F, "brown");
        System.out.println("Triunchi3 este egal cu Triunghi1: " + tri.equals(tri3));

        System.out.println("Numarul de instante create: " + Form.counter);

        PasswordMaker passwordMaker = new PasswordMaker("Marcel123");
        String password = passwordMaker.getPassword();
        System.out.println("Generated Password: " + password);
    }

}