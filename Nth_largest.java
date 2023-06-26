package array;

import java.util.Arrays;
import java.util.Scanner;

public class Nth_largest {

//    // find the  Nth largest element
    public static int Nthlargest(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick Nth no. :");
        int a =sc.nextInt();
        if (arr.length < a) {
        System.out.println("Array should have at least "+a+" elements");
            return -1;

        }
        Arrays.sort(arr);


        int result=arr[arr.length-a];

        return result;
    }
    public static void main(String args[]){
        int arr[]={2,3,4,2,8,7,9};

        System.out.println("Nthlargest : "+Nthlargest(arr));

    }

}
