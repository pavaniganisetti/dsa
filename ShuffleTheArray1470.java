class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int newLen = 2*n;
        int[] ans = new int[newLen];

        /**

        for (int x = 0, newX = 0 ; x < n && newX < newLen ; x++, newX=newX+2) {
            ans[newX] = nums[x];
        }

        for (int j = n, newJ = 1 ; j < newLen && newJ < newLen ; j++, newJ=newJ+2) {
            ans[newJ] = nums[j];
        } 
        
         */

        for (int pos = 0 ; pos < n ; pos++) {
            ans[2*pos] = nums[pos];
            ans[2*pos+1] = nums[pos+n];
        }
        
        return ans;
    }
        
}
