import java.util.*;

class Solution {
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        long MOD = 1_000_000_007;

        int[] H = addB(hFences, m);
        int[] V = addB(vFences, n);
        Set<Integer> heights = new HashSet<>();
        for(int i = 0 ; i < H.length ; i++){
            for(int j = i + 1; j < H.length ; j++){
                heights.add(H[j] - H[i]);
            }
        }
        int maxside = 0;
        for (int i = 0; i < V.length; i++) {
            for (int j = i + 1; j < V.length; j++) {
                int width = V[j] - V[i];
                if(heights.contains(width)){
                    maxside = Math.max(maxside,width);
                }
            }
        }

        return maxside == 0 ? -1 : (int)((long)maxside*maxside % MOD);
    }
    private int[] addB(int[] fences, int limit){
        int[] arr = new int[fences.length +2];
        arr[0] = 1;
        arr[arr.length -1] = limit;
        for(int i = 0 ; i < fences.length; i ++){
            arr[i+1] = fences[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}