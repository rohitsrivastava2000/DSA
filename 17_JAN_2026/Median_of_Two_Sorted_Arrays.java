class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int k=m+n;
        int[] arr= new int[k];
        int index=0;
        for(int i=0;i<m;i++){
            arr[index++]=nums1[i];
        }
        for(int i=0;i<n;i++){
            arr[index++]=nums2[i];
        }
        Arrays.sort(arr);
        if (k % 2 != 0){
            return arr[k / 2];
        }
        else{
            return (arr[k / 2 - 1] + arr[k / 2]) / 2.0;
        }
    }
}