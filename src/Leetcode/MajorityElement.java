package Leetcode;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 1, 1, 1, 2, 1};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int current = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                count++;
                current = nums[i];
            } else if (current == nums[i]) {
                count++;
            } else count--;

        }
        return current;
    }
}
