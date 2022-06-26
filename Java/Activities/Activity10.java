package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args){
        HashSet hs = new HashSet();
        hs.add("mahesh");
        hs.add("lav");
        hs.add("kiran");
        hs.add("sahitya");

        System.out.println("Number of elements in the hashset are "+hs.size());

        hs.remove("sahitya");

        if(hs.remove("Venkanna"))
            System.out.println("Venkanna removed from the set");
        else System.out.println("Venkanna is not there in the set");

        if(hs.contains("venkanna")){
            System.out.println("Yes");
        }
        else System.out.println("No");

        System.out.println("Updated set is "+hs.toString());

    }
}
