/*Given a sentence in the form of a string, convert it into its equivalent mobile numeric keypad sequence. */
import java.util.*;
class Solution{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.next();
String[] arr={"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
String result="";
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)==' ')
	{
		result=result+"0";
	}
	else{
	int index=s.charAt(i)-'A';
	result=result+arr[index];
	}
}
String match=sc.next();
System.out.println(result);
if(match.compareTo(result)==0)
System.out.println("Match");
else
System.out.println("Not Match");
}
}
		
