import java.util.*;

class Solution {
    
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = 0;

        List<Boolean> ans=new ArrayList<Boolean>();  
        
        for (int i = 0 ; i < candies.length ; i++ ) {            
            if (max < (candies[i]))
                max = candies[i];
        }

        for (int i = 0; i < candies.length ; i++ ) {
            if ((candies[i] + extraCandies) >= max) ans.add(i, true);
            else ans.add(i, false);
        }

        return ans;

    }
}
