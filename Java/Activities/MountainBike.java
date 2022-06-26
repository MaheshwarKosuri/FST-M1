package activities;

public class MountainBike extends Bicycle{
    public int height;

    MountainBike(int gears, int speed, int height) {
        super(gears, speed);
        this.height = height;
    }

    public void setHeight(int ht){
        height = ht;
    }

    public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + height);
    }
}
