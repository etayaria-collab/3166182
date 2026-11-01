package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {
    
   static class SmartBox<T> {

    private T item;
    private String boxName;

    public SmartBox(String boxName) {
        this.boxName = boxName;
    }

    public void store(T item) {
        this.item = item;
        System.out.println("Item stored in " + boxName);
    }

    public T retrieve() {
        return item;
    }

    public void display() {
        System.out.println("Box: " + boxName);
        System.out.println("Content: " + item);
    }
}


    public static void main(String[] args) {
       
      
        SmartBox<String> nameBox =new SmartBox<>("Names Box");

        SmartBox<Integer> numberBox = new SmartBox<>("Numbers Box");

        SmartBox<Double> priceBox =new SmartBox<>("Prices Box");

        nameBox.store("Abdulrahman");
        numberBox.store(21);
        priceBox.store(99.99);

        nameBox.display();
        numberBox.display();
        priceBox.display();
    }
}
