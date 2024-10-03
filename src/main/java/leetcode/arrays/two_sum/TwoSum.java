package main.java.leetcode.arrays.two_sum;

import java.util.Arrays;

public class TwoSum {
  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {2,7,11,15};
    final int[] ints = solution.twoSum(nums, 9);
    System.out.println(Arrays.toString(ints));
  }
}
