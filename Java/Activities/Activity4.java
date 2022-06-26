package activities;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args){
        int num[] = {2, 3, 1, 5, 4, 10, 11};
        System.out.println("Array before sorting is "+ Arrays.toString(num));
        int temp[] = new int[20];
        for (int j:num) {
            for (int i = 0; i<num.length-1 ; i++) {
                if (num[i + 1] > num[i]) {
                    temp[i] = num[i];
                } else temp[i] = num[i + 1];
            }
        }

        System.out.println("Array after sorting is "+Arrays.toString(temp));
    }
}
