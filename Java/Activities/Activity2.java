package activities;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Activity2 {
    public static void main(String[] args){
        int temp = 0;
        int arr[] = {10,77,10,54,-11,10};
        System.out.println("Array elements are "+ Arrays.toString(arr));

        for(int i=0; i<arr.length; i++){
            if(arr[i]==10){
                temp = temp + arr[i];
            }
        }
        if(temp==30)
            System.out.println("Sum equals to 30");
        else System.out.println("Not equals to 30");
    }
}
