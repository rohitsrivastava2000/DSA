class Solution {
    long mainAns=0;
    void solve(int[] nums){
        int n = nums.length;

        for(int i = 0; i<n;i++){
            long tempSum=0;
            long count=0;
            for(int j=1;j*j<=nums[i];j++){
                if(nums[i]%j==0 ){

                    tempSum+=j;                    
                    tempSum+=nums[i]/j; 

                    if(j*j!=nums[i]){
                        count+=2;
                    }
                    else{
                        count+=1;
                    }            
                    
                }
            }          
            if(count==4){
                mainAns+=tempSum;
            }
        }
        
    }
    public int sumFourDivisors(int[] nums) {
        solve(nums);
        return (int)mainAns;
    }
}