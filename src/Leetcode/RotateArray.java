package Leetcode;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        rotate(nums, 3);
    }

    public static void reverse(int[] nums, int i, int j){
        int leftIndex = i;
        int rightIndex = j;

        while(leftIndex < rightIndex){
            int temporary = nums[leftIndex];
            nums[leftIndex] = nums[rightIndex];
            nums[rightIndex] = temporary;

            leftIndex++;
            rightIndex--;
        }
    }
    public static void rotate(int[] nums, int offset) {
        offset = offset % nums.length;
        if(offset < 0){
            offset += nums.length;
        }
        reverse(nums, 0, nums.length - offset - 1);
        reverse(nums, nums.length - offset, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
