/* Given a string s, return the longest palindromic substring in s.*/

class Solution {
    public String longestPalindrome(String s) {
        
        int max=1;
        String res="";
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            int left=i,right=i;
            int len=1;
            while(left>=0&&right<ch.length&&ch[left]==ch[right])
            {
                len=len+2;
                left--;
                right++;
            }
            len=len-2;
            if(max<=len)
            {
            max=len;
            res=s.substring(left+1,right);
            }
        }
        
        for(int i=0;i<ch.length;i++)
        {
            int left=i,right=i+1;
            int len=0;
            while(left>=0&&right<ch.length&&ch[left]==ch[right])
            {
                len=len+2;
                left--;
                right++;
            }
            if(max<=len)
            {
            max=len;
             res=s.substring(left+1,right);
            }
        }
        return res;
    }
}
