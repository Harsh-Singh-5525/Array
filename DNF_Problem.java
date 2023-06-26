package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DNF_Problem {

    public static void sortColors(int[] nums) {
//        Arrays.sort(nums);
//    }


        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0: // Red
                    swap( nums,low, mid);
                    low++;
                    mid++;
                    break;
                case 1: // White
                    mid++;
                    break;
                case 2: // Blue
                    swap( nums,mid, high);
                    high--;
                    break;
            }
        }
    }

    public static void swap(int[] nums,int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        System.out.println("Before sorting: " + Arrays.toString(nums));
        sortColors(nums);
        System.out.println("After sorting: " + Arrays.toString(nums));
    }
}

