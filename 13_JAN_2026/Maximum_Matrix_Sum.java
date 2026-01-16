class Solution {
    long countNegative=0;
    long totalSum=0;
    long minValue=Integer.MAX_VALUE;
    long mainAns=0;
    void solve(int[][] matrix){
        int n = matrix.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]<0){
                    countNegative++;
                    matrix[i][j]=matrix[i][j] * (-1);
                }               
                

                totalSum += matrix[i][j];
                minValue = Math.min(minValue,matrix[i][j]);
            }
        }
        if(countNegative % 2 ==0){
            mainAns=totalSum;
        }
        else{
            mainAns=(totalSum - (2 * minValue));
        }
    }
    public long maxMatrixSum(int[][] matrix) {
        solve(matrix);
        System.out.println(countNegative);
        System.out.println(totalSum);
        System.out.println(minValue);
        System.out.println(mainAns);
        return mainAns;
    }
}