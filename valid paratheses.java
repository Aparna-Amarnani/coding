/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Solution-*/
class Solution {
    public boolean isValid(String s) {
        List<Character> stk=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
            {
                stk.add(s.charAt(i));
            }
            else
            {
                if(stk.size()==0)//3rd condition
                return false;
                char ch=stk.remove(stk.size()-1);
                if(s.charAt(i)==')'&&ch!='(')//2nd conditon
                return false;
                else if(s.charAt(i)=='}'&&ch!='{')
                return false;
                else if(s.charAt(i)==']'&&ch!='[')
                return false;
                else 
                continue;
            }
        }
            if(stk.size()!=0)
            return false;
            else
            return true;
        }
    }
