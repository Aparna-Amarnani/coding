/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
*/

class Solution {
    public boolean isPalindrome(String s) {
        String s1="";
        s=s.toUpperCase();
        for(int i=0;i<s.length();i++)
        {
           char ch= s.charAt(i);
            if(Character.isDigit(ch)||Character.isLetter(ch))
            {
                s1=s1+s.substring(i,i+1);
            }
        }
        int count=0;
        for(int i=s1.length()-1;i>=0;i--)
        {
            if(s1.charAt(i)==s1.charAt(s1.length()-1-i))
            {
                count++;
            }
        }
        if(count==s1.length())
        return true;
        else 
        return false;
    }
}
