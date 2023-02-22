class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n=mat.length,m=mat[0].length,k=0;
        int[] arr=new int[m*n];
        for(int i=0;i<m+n-1;i++)
        {
            List<Integer> list=new ArrayList<>();
            int r=i<m?0:i-m+1;
            int c=i<m?i:m-1;
            while(r<n&&c>=0)
            {
                list.add(mat[r][c]);
                r++;
                c--;
            }
            if(i%2==0)
            {
                Collections.reverse(list);
            }
            for(int j=0;j<list.size();j++)
            {
                arr[k]=list.get(j);
                k++;
            }
        }
        return arr;
    }
}
