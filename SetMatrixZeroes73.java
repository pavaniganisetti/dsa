
/**
Time complexity: O(m*n(m+n))
Space complexity: O(m*n)
*/

class Solution {
    public void setZeroes(int[][] arr) {
        
        int rowLen = arr.length;
        int colLen = arr[0].length;;

        int[][]  ans = new int[rowLen][colLen];

        for (int i=0;i<rowLen;i++){
            for (int j=0;j<colLen;j++) {
                ans[i][j] = 1;
            }
        }

        for (int i=0;i<rowLen;i++){
            for (int j=0;j<colLen;j++) {
                if (arr[i][j] == 0) {
                    
                    for (int k = 0; k < rowLen; k++)
                        ans[k][j] = 0; 
                    for (int k = 0; k <colLen;k++)
                        ans[i][k] = 0;

                }
            }
        }

        for (int i=0;i<rowLen;i++){
            for (int j=0;j<colLen;j++) {
                if (ans[i][j] == 0)
                    arr[i][j] = ans[i][j];
            }
        }

    }
}



/**
Space complexity O(m+n)
Time complexity O(m*n)
*/

class Solution {
    public void setZeroes(int[][] arr) {

        boolean[] row = new boolean[arr.length];
        boolean[] col = new boolean[arr[0].length];

        for (int i = 0 ; i < row.length ; i++)
            row[i] = false;
        for (int j = 0 ; j < col.length ; j++)
            col[j] = false;

        for (int i=0;i < row.length;i++) {
            for (int j=0;j<col.length;j++) {
                if (arr[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        System.out.println("Hash " + Arrays.toString(row) + " " + Arrays.toString(col));

        for (int i=0;i < row.length;i++) {
            for (int j=0;j<col.length;j++) {
                if (row[i] == true || col[j] == true) {
                    arr[i][j] = 0;
                }
            }
        }
    }
}


