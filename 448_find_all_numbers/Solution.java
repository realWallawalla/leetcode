import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
  public static void main(String[] args) {
    int[] nums = new int[args.length];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = Integer.parseInt(args[i]);
    }
    Solution solution = new Solution();
    Set<Integer> output = solution.findDisappearedNumbers(nums);
    Set<Integer> output2 = solution.findDisappearedNumbers2(nums);
    for (int i : output) {
      System.out.print(i);
    }

    System.out.println();
    for (Integer integer : output2) {
      System.out.print(integer);
    }
  }

  private Set<Integer> findDisappearedNumbers(int[] nums) {
    Set<Integer> uniqueNumbers = new HashSet<>();
    Set<Integer> missingNumbers = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      uniqueNumbers.add(nums[i]);
    }

    for (int i = 0; i < nums.length; i++) {
      if (!uniqueNumbers.contains(i + 1)) {
        missingNumbers.add(i + 1);
      }
    }
    return missingNumbers;
  }

  // space complexity O(1), time complexity(O(n))
  private Set<Integer> findDisappearedNumbers2(int[] nums) {
    Set<Integer> missingNumbers = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      int idx = Math.abs(nums[i]) -
                1; // number in nums used as index, abs if negative already
      if (nums[idx] > 0) {
        nums[idx] = -nums[idx]; // negate to mark number visited
      }
    }

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        missingNumbers.add(i + 1);
      }
    }
    return missingNumbers;
  }
}
