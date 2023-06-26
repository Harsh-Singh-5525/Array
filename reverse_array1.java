package array;

import java.util.Scanner;

public class reverse_array1 {
    public static void main(String[] args) {
        int [] a1=new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks :");
        a1[0] = sc.nextInt();
        a1[1] = sc.nextInt();
        a1[2] = sc.nextInt();
        a1[3] = sc.nextInt();
        a1[4] = sc.nextInt();
        System.out.println("Marks in serial order :");
        for ( int element : a1) {
            System.out.println(element);
        }
        System.out.println("Marks in reverse order :");
        int temp ;
        int l = a1.length;
        int n = 2;
      for (int i=0;i<n;i++)
      {
       temp = a1[i];
       a1[i]=a1[l-i-1];
        a1[l-i-1] = temp;}
        for ( int element : a1) {
            System.out.println(element);
        }

    }
}
