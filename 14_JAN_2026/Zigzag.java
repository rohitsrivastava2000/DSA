class Solution 
{
    public String convert(String s, int numRows) 
    {
       StringBuilder[] rows=new StringBuilder[numRows];
       for(int k=0;k<numRows;k++)
       {
        rows[k]=new StringBuilder();
       }
       int i=0;
       while(i<s.length())
       {
         int j;
         for(j=0;j<numRows && i<s.length();j++)
         {
            rows[j].append(s.charAt(i));

            i++;
         }
         for(j=numRows-2;j>=1 && i<s.length();j--)
         {
            rows[j].append(s.charAt(i));
            i++;
         }
       }
       StringBuilder result=new StringBuilder();
       for(StringBuilder row:rows)
       {
            result.append(row);
       }
       return result.toString();
        
    }
}