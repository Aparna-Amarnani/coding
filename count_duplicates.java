/*Print the count of all duplicates in the String*/
import java.util.*;
import java.util.Map.Entry;
class Solution
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
Map<Character,Integer> map=new HashMap<>();
for(int i=0;i<s.length();i++)
{
  char ch=s.charAt(i);
  if(map.containsKey(ch))
	{
		int count=map.get(ch);
		count++;
		map.put(ch,count);
	}
  else
	{
		map.put(ch,1);
	}
}
for(Entry<Character,Integer> entry: map.entrySet())
{
	if(entry.getValue()>1)
		System.out.println(entry.getKey()+" : "+entry.getValue());
}
}
}
