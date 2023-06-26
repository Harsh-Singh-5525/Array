package array;

import java.util.Scanner;

public class max_element_array {
    public static void main(String[] args) {
        float[] marks = new float[5];
        System.out.println("Enter marks :");
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextFloat();
        marks[1] = sc.nextFloat();
        marks[2] = sc.nextFloat();
        marks[3] = sc.nextFloat();
        marks[4] = sc.nextFloat();
        float max = marks[0];
        for (float element : marks) {

        if (element > max)
            max = element;
    }
        System.out.println("Maximum marks :"+max);
    }}