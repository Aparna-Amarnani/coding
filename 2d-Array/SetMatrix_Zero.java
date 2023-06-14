class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> row=new ArrayList<>();
        List<Integer> column=new ArrayList<>();
        for(int r=0;r<matrix.length;r++)
        {
            
            for(int c=0;c<matrix[r].length;c++)
            {
                if(matrix[r][c]==0)
                {
                    row.add(r);
                    column.add(c);
                }
            }
        }
        for(int r:row)
        {
            for(int c=0;c<matrix[r].length;c++)
            {
                matrix[r][c]=0;
            }
        }
        for(int c:column)
        {
            for(int r=0;r<matrix.length;r++)
            {
                matrix[r][c]=0;
            }
        }
    }
}