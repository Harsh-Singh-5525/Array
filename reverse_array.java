package array;

import java.util.Scanner;




    public class reverse_array {
        public static void main(String[] args) {
           int [] marks = new int[5];
            System.out.println("Enter marks :");
            Scanner sc = new Scanner(System.in);
            marks[0] = sc.nextInt();
            marks[1] =sc.nextInt();
            marks[2] = sc.nextInt();
            marks[3] = sc.nextInt();
            marks[4] = sc.nextInt();
            System.out.println("Marks in serial order :");
            for (int element : marks)
            { System.out.println(element);
            }
            System.out.println("Marks in reverse order :");
            int l= marks.length;
           int n = Math.floorDiv(l,2);
         int temp;
            for (int i=0;i<n;i++) {
                temp = marks[i];
                marks[i] = marks[l - i - 1];
                marks[l - i - 1] = temp;
            }
            for(int element:marks)
                System.out.println(element);
        }    }




