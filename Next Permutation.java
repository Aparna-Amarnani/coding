/* Implement the next permutation, which rearranges the list of numbers into Lexicographically next greater permutation of list of numbers. If such arrangement is not possible, it must be rearranged to the lowest possible order i.e. sorted in an ascending order. You are given an list of numbers arr[ ] of size N.*/

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> nextPermutation(int N, int a[]){
        int ind1=-1,ind2=0;
        for(int i=N-2;i>=0;i--)
        {
            if(a[i]<a[i+1])
            {
                ind1=i;
                break;
            }
        }
        if(ind1==-1)
        {
            List<Integer> arr=new ArrayList<>();
            for(int i:a)
            {
                arr.add(i);
            }
            Collections.sort(arr);
            return arr;
        }
        for(int i=N-1;i>=0;i--)
        {
            if(a[i]>a[ind1])
            {
                ind2=i;
                break;
            }
        }
        int temp=a[ind1];
        a[ind1]=a[ind2];
        a[ind2]=temp;
        List<Integer> arr=new ArrayList<>();
        for(int i=ind1+1;i<=N-1;i++)
        {
            arr.add(a[i]);
        }
        for(int i=ind1;i>=0;i--)
        {
            arr.add(a[i]);
        }
        Collections.reverse(arr);
        return arr;
    }
}
