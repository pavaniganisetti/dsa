class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int richestCustomerWealth = 0;

        for (int i = 0; i < accounts.length ; i++ ) {

            int eachCustomerWealth = 0;

            for (int j = 0; j < accounts[i].length ; j ++ ) {
                eachCustomerWealth += accounts[i][j];
            }

            if (richestCustomerWealth <= eachCustomerWealth)
                richestCustomerWealth = eachCustomerWealth;
        }

        return richestCustomerWealth;

    }
}
