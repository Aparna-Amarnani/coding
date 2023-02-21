//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class Main
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String arr[] = br.readLine().split(" ");
                    String A = arr[0];
                    String B = arr[1];
                    Solution obj = new Solution();
                    System.out.println(obj.transform (A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int transform (String A, String B)
    {
        char[] a=A.toCharArray();
        char[] b=B.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        String s1=new String(a);
        String s2=new String(b);
        
        if(!s1.equals(s2))
        return -1;
        
        //convertible
        
        int res=0;
        int i=A.length()-1;
        int j=B.length()-1;
        
        //Core part
        while(i>=0)
        {
            if(A.charAt(i)!=B.charAt(j))
                res++;
            else
                j--;
            i--;
        }
        return res;
    }
}
