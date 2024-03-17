/**
A peak element is an element that is strictly greater than its neighbors.
Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.

Example 1:
Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.

Example 2:
Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.

*/

class Solution {
    public int findPeakElement(int[] nums) {
        
        // Basically nums contains a set of numbers in ascending order.
        // Ie., [0, 1, 5, 3, 5, 9]
        // 0, 1, 5 is one set of array 
        // 3, 5, 9 is second set of array
        // We don't know whats the peak element in these sets.

        int len = nums.length;

        // If array consists of only one value.. then its the only highest peak;
        if (len == 1) return 0;

        // Check if the 0th element is the peak;
        else if (nums[0] > nums[1]) return 0;

        // Check if the last element is the peak;
        else if (nums[len-1] > nums[len-2]) return len-1;

        else return binarySearch(nums);
    }

    public int binarySearch(int[] nums) {
        int len = nums.length;

        // Starting with s = 1, since we already know that 0th element is not peak 
        int s = 1;

        // Starting with length-2 ie., 2nd element from last, 
        // since we already know last element is not the peak
        int e = nums.length-2;

        int m = 0;
        while (s <= e) {
            m = s + ((e-s)/2);

            if (nums[m] > nums[m-1] && nums[m] > nums[m+1]) // Found the answer
                return m;
            else if (nums[m] > nums[m-1]) // Peak is in right side
                s = m+1;
            else
                e = m-1;    // Peak is in left side
        }
        return m;

    }
}
