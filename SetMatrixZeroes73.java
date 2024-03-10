



// Space complexity O(m+n)

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


