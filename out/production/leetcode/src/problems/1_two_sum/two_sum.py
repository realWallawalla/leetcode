from typing import List
import sys
import argparse
from typing import Dict

# Create an ArgumentParser object
parser = argparse.ArgumentParser(
    description="two sum leetcode problem, for more info visit leetcode.com and look up problem description"
)

# Define the arguments
parser.add_argument(
    "-t", "--arg1", type=int, help="target should equal sum of 2 entries in list"
)
parser.add_argument("-l", "--arg2", type=int, nargs="+", help="array of ints")

parser.add_argument(
    "-e", "--arg3", type=bool, help="boolean flag for efficient solution"
)


class src.problems.range_sum_query_303.Solution:
    def two_sum(self, nums: List[int], target: int) -> List[int]:
        for i in range(0, len(nums) - 1):
            for ii in range(i + 1, len(nums)):
                if nums[i] + nums[ii] == target:
                    return [i, ii]
        return []

    def two_sum_efficient(self, nums: List[int], target: int) -> List[int]:
        number_look_up: Dict[int, int] = {}
        for i in range(0, len(nums)):
            diff = target - nums[i]
            if diff in number_look_up:
                return [number_look_up[diff], i]
            else:
                number_look_up[nums[i]] = i
        return []


if __name__ == "__main__":
    args = parser.parse_args()
    if args.arg3:
        print(src.problems.range_sum_query_303.Solution().two_sum_efficient(args.arg2, args.arg1))
    else:
        print(src.problems.range_sum_query_303.Solution().two_sum(args.arg2, args.arg1))
