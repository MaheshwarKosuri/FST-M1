package activities;

public class Activity6 {
    public static void main(String[] args){
        Plane plane = new Plane(10);
        plane.onboard("Ram");
        plane.onboard("Mahesh");
        plane.onboard("Soumya");

        System.out.println("Plane took off from ground at "+plane.takeOff());

        System.out.println("People on the plane are "+plane.getPassengers());

        plane.land();
        System.out.println("Plane landed at "+plane.getLastTimeLanded());
        System.out.println("Number of people on the plane after landing are "+plane.getPassengers().size());
        System.out.println("People on the plane after landing are "+plane.getPassengers());

    }
}
