//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s, patt;
            s = sc.next();
            patt = sc.next();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.search(patt, s);
            
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    ArrayList<Integer> search(String pat, String S)
    {
        char[] p=pat.toCharArray();
        char[] s=S.toCharArray();
        int n=S.length(),m=pat.length();
        
        int s1=0,p1=0;
        
        int d=26,q=79;
        
        int h=1;
        
       for (int i = 0; i < m - 1; i++)
            h = (h * d) % q;
        
        for(int i=0;i<m;i++)
        {
           p1=(p1*d+p[i])%q;
           s1=(s1*d+s[i])%q;
        }
        //System.out.println(p1+" "+s1);
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<=n-m;i++)
        {
            if(p1==s1)
            {
                int count=0;
                for(int j=0;j<m;j++)
                {
                    if(p[j]==s[j+i])
                    count++;
                }
                if(count==pat.length())
                arr.add(i+1);
            }
            if(i<n-m)
            s1=((d*(s1-s[i]*h))+s[i+m])%q;
            if(s1<0)
            s1=s1+q;
           //System.out.println(s1);
        }
        if(arr.size()==0)
        arr.add(-1);
        return arr;
    }
}
