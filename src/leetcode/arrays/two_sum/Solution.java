package leetcode.arrays.two_sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    int[] arr = new int[2];
    for(int i = 0; i < nums.length; i++) {
      final Integer p1 = map.get(nums[i]);
      if(p1 != null) {
        arr[0] = p1;
        arr[1] = i;
        break;
      } else {
        map.put(target - nums[i], i);
      }
    }
    return arr;
  }
}
