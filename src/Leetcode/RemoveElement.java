package Leetcode;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        System.out.println(removeElement(nums, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        int x = 0;
        //Алгоритм Бойеса-Мура "о большинстве голосовавших"
        while (x < nums.length) {
            if (nums[count++] != val) {
                nums[count++] = nums[count - 1];
            }
        }
        return count;
    }
}
