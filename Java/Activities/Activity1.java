package activities;

public class Activity1 {
    public static void main(String [] args){
        Car hondaCity = new Car();
        hondaCity.make = 2019;
        hondaCity.color = "Black";
        hondaCity.transmission = "Manual";

        hondaCity.displayCharacteristics();
        hondaCity.accelerate();
        hondaCity.brake();


    }
}
