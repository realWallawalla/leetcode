
public class Solution {
  public static void main(String[] args) {
    int[] nums = new int[args.length];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = Integer.parseInt(args[i]);
    }
    Solution solution = new Solution();
    int result = solution.singleNumber(nums);
    int result2 = solution.singleNumber2(nums);
    System.out.println(result);
    System.out.println(result2);
  }

  private int singleNumber(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      int idx = Math.abs(nums[i]) - 1;
      nums[idx] = -nums[idx];
    }
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < 0) {
        return i + 1;
      }
    }
    return 0;
  }

  private int singleNumber2(int[] nums) {
    int unique = 0;
    for (Integer n : nums) {
      unique ^= n;
    }
    return unique;
  }
}
