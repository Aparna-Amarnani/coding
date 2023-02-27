/*Rotate a nxn matrix by 90 deg */


class Solution {
    public void rotate(int[][] matrix) {
        int square=0;
        int c=matrix[0].length;
        int left=0,right=c-1,top=0,bottom=c-1;
        while(left<right)
        {
            int temp=0;
            //i serves as the offset
            for(int i=0;i<c-square-1;i++)
            {
                temp=matrix[top][left+i];
                matrix[top][left+i]=matrix[bottom-i][left];
                matrix[bottom-i][left]=matrix[bottom][right-i];
                matrix[bottom][right-i]=matrix[top+i][right];
                matrix[top+i][right]=temp; 
                
            }
            left++;
            right--;
            top++;
            bottom--;
            square+=2;
        }
    }
}
