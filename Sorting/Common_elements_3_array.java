class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        Set<Integer> a=new HashSet<>();
        Set<Integer> b=new HashSet<>();
        Set<Integer> c=new HashSet<>();
        for(int i=0;i<n1;i++)
        {
            a.add(A[i]);
        }
        for(int i=0;i<n2;i++)
        {
            b.add(B[i]);
        }
        for(int i=0;i<n3;i++)
        {
            c.add(C[i]);
        }
        a.retainAll(b);
        a.retainAll(c);
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i:a)
        {
            arr.add(i);
        }
        Collections.sort(arr);
        return arr;
    }
}
