class Vehicle {
    String make;
    String model;
    int year;
}

class Car extends Vehicle {
    int numberOfDoors;
    
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + super.make);
        System.out.println("Model: " + super.model);
        System.out.println("Year: " + super.year);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
    
}

public class Taskshet1_1_11 {
    
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.make = "Toyota";
        car1.model = "Camry";
        car1.year = 2022;
        car1.numberOfDoors = 4;
        car1.displayDetails();
    }
    
}