package activities;

public class Activity12 {
    public static void main(String[] args){
        Addable ad1 = (num1,num2) -> (num1+num2);
        System.out.println(ad1.add(10,2));

        Addable ad2 = (num1,num2) -> {
                    return num1+num2;
                };
        System.out.println(ad1.add(12,4));
    }




}
