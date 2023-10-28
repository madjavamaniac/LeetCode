package Leetcode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        merge(nums1, 3,nums2, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int newSize = n + m - 1;
        while (i >= 0) {
            if (j >= 0 && nums1[i] < nums2[j]) {
                nums1[newSize--] = nums2[j--];
            } else {
                nums1[newSize--] = nums1[i--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
