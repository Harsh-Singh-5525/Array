package array;

import java.util.Scanner;

public class sum_array {
    public static void main(String[] args) {
        float [] marks = new float[5];
                System.out.println("Enter marks :");
                Scanner sc = new Scanner(System.in);
                marks[0] = sc.nextFloat();
                marks[1] =sc.nextFloat();
                marks[2] = sc.nextFloat();
                marks[3] = sc.nextFloat();
                marks[4] = sc.nextFloat();
                float sum = 0;
                System.out.println("Sum of given marks :");
                for (float element : marks) {
                    sum = sum + element;
                }
                System.out.println(sum);
            }
        }


