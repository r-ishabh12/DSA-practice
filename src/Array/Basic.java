package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Basic {
    static int largestElementInAnArray(int[] nums){
        int max = nums[0];
        for (int i = 0; i < nums.length; i++){
            if (max < nums[i]){
                max = nums[i];
            }
        }
        return max;
        //Time complexity : O(n)
    }
    static boolean arrayIsSorted(ArrayList<Integer> nums){
        boolean flag = false;
        for (int i = 1 ; i < nums.size(); i++){
            if (nums.get(i) > nums.get(i-1)){
                flag = true;
            }else{
                flag = false;
                break;
            }
        }
        return flag;
        //Time Complexity : O(n)
    }
    static int secondLargest(int[] nums){
        int max = nums[0];
        for (int i = 0; i < nums.length; i++){
            if (max < nums[i]){
                max = nums[i];
            }
        }
        int secondMax = -1;

        for (int i = 0; i < nums.length; i++){
            if (secondMax < nums[i] && nums[i] != max){
                secondMax = nums[i];
            }
        }
        return secondMax;
        //Time Complexity : O(n+(n-1)) -> O(n)
    }
    static int linearSearch(int[] nums, int target){
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    static void arrayRotate(int[] nums){
        for (int i = 1; i < nums.length; i++){
            swap(nums,i,i-1);
        }
    }

   static void swap(int[] nums, int i, int i1) {
        int temp = nums[i];
        nums[i] = nums[i-1];
        nums[i-1] = temp;
    }


    public static void main(String[] args) {
//        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(67,23,1,2,3));
//        System.out.println(arrayIsSorted(nums));
        int[] nums = {1,2,3,4,5};
//        System.out.println(secondLargest(nums));
//        System.out.println(linearSearch(nums,5));
        arrayRotate(nums);
        System.out.println(Arrays.toString(nums));

    }
}
