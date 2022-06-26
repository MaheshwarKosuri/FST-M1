package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args){
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Mahesh");
        myList.add("Lavanya");
        myList.add("Kiran");
        myList.add("Sahitya");
        myList.add("Venkanna");

        for (String name: myList)
            System.out.println("Names in the list is "+name);

        System.out.println("3rd Name in the list is "+myList.get(2));

        if(myList.contains("Kiran"))
            System.out.println("Kiran is there in the list");
        else System.out.println("Kiran is not there in the list");

        System.out.println("Number of the names in the list are "+myList.size());

        myList.remove("Venkanna");
        System.out.println("Number of the names in the list after removing one name are "+myList.size());

    }


}
