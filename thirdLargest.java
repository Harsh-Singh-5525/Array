package array;

import java.util.*;

public class thirdLargest {

    // find the  third largest element
    public static int thirdlargest(int arr[]){
        if (arr.length < 3) {
        System.out.println("Array should have at least three elements");
         return -1;

        }
        else {
        Arrays.sort(arr);

        int result=arr[arr.length-3];

        return result;
        }
    }
    public static void main(String args[]){
        int arr[]={2,6,3,4,2,8,7,9};

        System.out.println("thirdlargest : "+thirdlargest(arr));
    }
}