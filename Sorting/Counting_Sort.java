class Solution
{
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String arr)
    {
       char[] ch=arr.toCharArray();
       Arrays.sort(ch);
       String s=new String(ch);
       return s;
    }
}
