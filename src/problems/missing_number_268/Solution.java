package src.problems.missing_number_268;

import java.util.Arrays;
import src.utils.ConvertInputUtil;

public class Solution {
  public static void main(String[] args) {
    int[] nums = ConvertInputUtil.convertStingNumsToInts(args);
    Solution solution = new Solution();
    System.out.println(solution.findMissingNumber(nums));
    System.out.println(solution.findMissingNumber2(nums));
  }

  private int findMissingNumber(int[] nums) {
    int[] result = new int[nums.length + 1];
    Arrays.fill(result, -1);
    for (int i = 0; i < nums.length; i++) {
      result[nums[i]] = nums[i];
    }

    for (int i = 0; i < result.length; i++) {
      if (result[i] == -1) {
        return i;
      }
    }
    return 0; // if no missing number, no 0
  }

  private int findMissingNumber2(int[] nums) {
    Arrays.sort(nums);
    if (nums[0] != 0) {
      return 0;
    }
    if (nums[nums.length - 1] != nums.length) {
      return nums.length;
    }
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != i) {
        return i;
      }
    }
    return 0;
  }
}
