
/**
Brute Force Approach

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
Using HashTable

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



/**
Using In-Place Hashing

Time complexity:  O(m*n)
Space complexity: O(1)
*/


class Solution {
    public void setZeroes(int[][] arr) {

        int m = arr.length;
        int n = arr[0].length;

        boolean firstRow = false;
        boolean firstCol = false;

        for (int i=0;i<n;i++) {
            if ( arr[0][i] == 0) 
                firstRow = true;
        }

        for (int i=0;i<m;i++) {
            if (arr[i][0] == 0)
                firstCol = true;
        }
            
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                if (arr[i][j] == 0) {
                    arr[0][j] = 0;
                    arr[i][0] = 0;
                }
            }
        } 

        System.out.println(Arrays.toString(arr[0]));

        for (int i=1;i<m;i++) {
            for (int j=1;j<n;j++) {
                if (arr[0][j] == 0 || arr[i][0] == 0) {
                    arr[i][j] = 0;
                }
            }
        }

        if (firstRow == true) {
            for (int i=0;i<n;i++) {
                arr[0][i] = 0;
            }
        }

        if (firstCol == true) {
            for (int i=0;i<m;i++) {
                arr[i][0] = 0;
            } 
        }

    }
}




















