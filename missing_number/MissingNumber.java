import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {
  public static void main(String[] args) {
    int[] nums = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      nums[i] = Integer.parseInt(args[i]);
    }
    MissingNumber missingNumber = new MissingNumber();
    System.out.println(missingNumber.findMissingNumber(nums));
    System.out.println(missingNumber.findMissingNumber2(nums));
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
