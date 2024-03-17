/**
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Example 3:
Input: nums = [], target = 0
Output: [-1,-1]
*/

class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] ans = new int[2];


        ans[0] = binarySearch(nums, target, true);

        ans[1] = binarySearch(nums, target, false);

        return ans;
    }

    public int binarySearch(int[] arr, int target, boolean findFirst) {

        int start = 0;
        int end = arr.length-1;
        int result = -1;
        

        while (start<=end ) {
            
            int mid = start + ((end-start)/2);

            if (arr[mid] == target) {
                result = mid;

                if (findFirst) end = mid-1;
                else start = mid + 1;
                      
            }
                
            else if (arr[mid] > target) { // move end position;
                end = mid-1;
            }
            else { // move start position;
                start = mid + 1;
            }
            
        }

        return result;
    }

}
