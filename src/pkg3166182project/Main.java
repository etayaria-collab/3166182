
package pkg3166182project;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> list = new ArrayList<>();
        
        list.add(new Vehicle("Toyota", 2020));
        list.add(new Car("BMW", 2022, 4));

        for (Vehicle v : list) {
            v.display();
        }

        Vehicle v = new Vehicle("Mercedes", 2023);
        v.display();
        v.display("New");
    }
}

class Vehicle {
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void display() {
        System.out.println(brand + " - " + year);
    }

    public void display(String extra) {
        System.out.println(brand + " - " + year + " (" + extra + ")");
    }
}

class Car extends Vehicle {
    private int doors;

    public Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }

    @Override
    public void display() {
        System.out.println(brand + " - " + year + " - Doors: " + doors);
    }
}