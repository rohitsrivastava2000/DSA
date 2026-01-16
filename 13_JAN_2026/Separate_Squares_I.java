class Solution {
    public double separateSquares(int[][] squares) {
        double yMIN=Double.MAX_VALUE;
        double yMAX=Double.MIN_VALUE;
        double totalArea=0;

        for(int i=0;i<squares.length;i++){
            yMIN=Math.min(yMIN,squares[i][1]);
            yMAX=Math.max(yMAX,squares[i][1]+squares[i][2]);

            totalArea+=(double)(squares[i][2]) * (squares[i][2]);

        }
        double requiredArea = totalArea/2;

        

        while((yMAX-yMIN)>1e-6){
            double mid = (yMAX-yMIN)/2.0 + yMIN;

            double currentSum=0;
            for(int i=0;i<squares.length;i++){
                if((squares[i][1]+squares[i][2])<=mid){
                    currentSum+=(double)(squares[i][2]) * (squares[i][2]);
                }
                else if(squares[i][1]<mid && mid<(squares[i][1]+squares[i][2])){
                    currentSum+=(double)(squares[i][2])*(mid-squares[i][1]);
                }
            }
           
            if(currentSum<requiredArea){
                yMIN=mid;
            }
            else{
                yMAX=mid;
            }
        }
        return yMIN;


    }
}