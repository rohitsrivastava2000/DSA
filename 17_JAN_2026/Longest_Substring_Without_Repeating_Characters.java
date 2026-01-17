class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0) return 0;
        StringBuilder sb=new StringBuilder("");
        sb.append(s.charAt(0));
        int currentLength=1;
        int maxLength=1;
        for(int i=1; i<n; i++)
        {
            if(sb.indexOf(String.valueOf(s.charAt(i)))==-1)
            {
                currentLength++;
                if(currentLength>maxLength) maxLength=currentLength;
            }
            else
            {
                sb.delete(0, sb.indexOf(String.valueOf(s.charAt(i)))+1);
                currentLength=sb.length()+1;
            }
            sb.append(s.charAt(i));
        }
        return maxLength;
    }
}