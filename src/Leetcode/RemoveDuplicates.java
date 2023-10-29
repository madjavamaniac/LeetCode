package Leetcode;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int index = 2;
        for (int i = 2; i < nums.length; i++) {
            if (index < 2 || nums[i] > nums[index - 2]) {
                nums[index++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return index;
    }
}
