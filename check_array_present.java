package array;

import java.util.Scanner;

public class check_array_present {
    public static void main(String[] args) {
        float [] marks = new float[5];
        System.out.println("Enter all marks :");
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextFloat();
        marks[1] = sc.nextFloat();
        marks[2] = sc.nextFloat();
        marks[3] = sc.nextFloat();
        marks[4] = sc.nextFloat();
        System.out.println("Check marks to check :");
        float num = sc.nextFloat();


        boolean a = false;
        for (float elements : marks) {
            if (num == elements){
                a = true;
            break;
        }}
        if (a)
                System.out.println(+num+ " is present in these marks");
            else
                System.out.println(+num+ " is not present in these marks");


    }


}


