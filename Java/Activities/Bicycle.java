package activities;

public class Bicycle implements BicycleParts, BicycleOperations{

    public int gears;
    public int speed;

    Bicycle(int gears, int speed){
        this.gears = gears;
        this.speed = speed;
    }
    @Override
    public void applyBreak(int decrement) {
        speed = speed - decrement;
        System.out.println("Present speed is "+speed);
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Present speed after increment is "+speed);
    }

    public String bicycleDesc() {
        return("No of gears are "+ gears + " \n Speed of bicycle is " + speed);
    }

}
