class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        
        Arrays.sort(hBars);
        Arrays.sort(vBars);

        int len1 = 1;
        int len2 = 1;
        int maxLen1 = 1;
        int maxLen2 = 1;
        for(int i=1;i<hBars.length;i++){
            if(hBars[i] == (hBars[i-1]+1)){
                len1++;
            }
            else{
                maxLen1 = Math.max(maxLen1,len1);
                len1=1;
            }
            
        }
        maxLen1 = Math.max(maxLen1,len1);
        for(int i=1;i<vBars.length;i++){
            if(vBars[i] == (vBars[i-1]+1)){
                len2++;
            }
            else{
                maxLen2 = Math.max(maxLen2,len2);
                len2=1;
            }
            
        }
        maxLen2 = Math.max(maxLen2,len2);
        System.out.println(maxLen1+" "+maxLen2);
        return ((Math.min(maxLen1,maxLen2)+1)*(Math.min(maxLen1,maxLen2)+1));



    }
}