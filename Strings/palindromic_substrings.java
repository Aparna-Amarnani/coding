/* Given a string s, return the number of palindromic substrings in it.

A string is a palindrome when it reads the same backward as forward.

A substring is a contiguous sequence of characters within the string.*/

class Solution {
    public int countSubstrings(String s) {
        int count=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++)//odd substrings
        {
            int left=i,right=i;
            while(left>=0&&right<ch.length&&ch[left]==ch[right])
            {
                count++;
                left--;
                right++;
            }
        }
        for(int i=0;i<ch.length;i++)
        {
            int left=i,right=i+1;
            while(left>=0&&right<ch.length&&ch[left]==ch[right])
            {
                count++;
                left--;
                right++;
            }
        }
        return count;
    }
}
