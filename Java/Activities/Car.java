package activities;

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    Car(){
        tyres = 4;
        doors = 4;
    }

    void displayCharacteristics(){
        System.out.println("Color of the Car is "+color);
        System.out.println("Transmission of the Car is "+transmission);
        System.out.println("Make of the Car is "+make);
        System.out.println("No of Doors for the Car are "+doors);
        System.out.println("No of Tyres for the the Car are "+tyres);

    }

    void accelerate(){
        System.out.println("Car is moving forward.");
    }

    void brake(){
        System.out.println("Car has stopped.");
    }


}
