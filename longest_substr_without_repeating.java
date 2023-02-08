/*Given a string s, find the length of the longest 
substring
 without repeating characters.
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> arr=new ArrayList<>();
        if(s.length()<=1)
        return s.length();
        int count=0,max=1;
        for(int i=0;i<s.length();i++)
        {
            if(!arr.contains(s.charAt(i)))
            {
                arr.add(s.charAt(i));
                count++;
            }
            else
            {
                int count1=arr.size();
                for(int j=0;j<count1;j++)
                {
                    if(arr.get(0)==s.charAt(i))
                    {
                        arr.remove(0);
                        break;
                    }
                    arr.remove(0);
                }
                arr.add(s.charAt(i));
                System.out.println(arr);
                count=arr.size();
            }
            if(max<count)
            max=count;
        }
        return max;
    }
}
