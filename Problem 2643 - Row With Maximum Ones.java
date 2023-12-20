class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] countArray = new int[mat.length];
        int rowNo = 0;
        int count;

        for(int i =0; i< mat.length; i++){
            for(int j = 0; j< mat[i].length; j++){
                if(mat[i][j]==1){
                    countArray[i] = countArray[i] + 1;
                }
            }
        }

        for(int k = 0; k <countArray.length; k++){
            if(countArray[k]>countArray[rowNo]){
                rowNo = k;
            }
        }
        count = countArray[rowNo];
        return new int[]{rowNo, count};

    }
}