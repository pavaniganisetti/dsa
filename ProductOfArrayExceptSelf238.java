/**
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

*/



/**
  Time complexity:  O(n)
  Auxilary Space complexity: O(n) excluding output array.
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] ans = new int[nums.length];

        /** 
        Left product

        For any nums[i], calculate its left product, with numbers on its left, 
        without including nums[i].

        Ex:1 arr = [1, 2, 3, 4] ==> left = [1, 1, 2, 6] 
        Ex:2 arr = [7, 8, 2, 3] ==> left = [1, 7, 56, 112]
        */

        int [] left = new int[nums.length];
        left[0] = 1; 

        for (int i=1;i<nums.length;i++) {
            left[i] = nums[i-1] * left[i-1];
        }

        /** 
        Right product

        For any nums[i], calculate its right product, with numbers on its right, 
        without including nums[i].

        Ex:1 arr = [1, 2, 3, 4] ==> left = [24, 12, 4,1] 
        Ex:2 arr = [7, 8, 2, 3] ==> left = [48 , 6, 3, 1]
        */

        int[] right = new int[nums.length];
        right[nums.length -1] = 1;

        for (int i=nums.length-2;i>=0;i--) {
            right[i] = right[i+1] * nums[i+1];
        }

        System.out.println("Left product " + Arrays.toString(left));

        System.out.println("Right product " + Arrays.toString(right));

        for (int i=0;i<nums.length;i++) {
            ans[i] = left[i]*right[i];
        }

        return ans;
    }
}







/**
  Time complexity: O(n)
  Space complexity: O(1) excluding output array.
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int[] ans = new int[n];

        Arrays.fill(ans, 1);

        int curr = 1;

        for (int i=0;i<n;i++) {
            ans[i] = ans[i]*curr;
            curr = curr * nums[i];
        }

        /**
        arr = [1,2,3,4] ans = [1,1,2,6]
         */

        curr = 1;

        for (int i=n-1;i>=0;i--) {
            ans[i] = ans[i]*curr;
            curr = curr * nums[i];
        }

        return ans;
    }
}

















