package activities;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Activity11 {
    public static void main(String[] args){
        Map<Integer, String> colors = new HashMap<Integer, String>();
        colors.put(301, "Black");
        colors.put(302, "Maroon");
        colors.put(303, "Blue");
        colors.put(304, "White");
        colors.put(305, "Red");

        System.out.println("colors added are "+colors);

        colors.remove(304);

        if(colors.containsValue("Red"))
            System.out.println("Red is there in the map");
        else System.out.println("Red is not there in the map");

        System.out.println("Size of the map is "+colors.size());


    }
}
