class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr=new ArrayList<>();

        int total=matrix.length*matrix[0].length;
        int startX=0,endX=matrix[0].length-1;
        int startY=0,endY=matrix.length-1;
        int i=startX,j=startY;
        int start=0;
        System.out.println(endY);
        while(start<total)
        {
            while(start<total&&i<=endX)
            {
                arr.add(matrix[j][i++]);
                start++;
            }
            i--;
            j++;
            while(start<total&&j<=endY)
            {
                arr.add(matrix[j++][i]);
                start++;
            }
            j--;
            i--;
            while(start<total&&i>=startX)
            {
                arr.add(matrix[j][i--]);
                start++;
            }
            i++;
            j--;
            while(start<total&&j>startY)
            {
                arr.add(matrix[j--][i]);
                start++;
            }
           
            startX++;
            startY++;
            endX--;
            endY--;
            i=startX;
            j=startY;
        }
        return arr;
    }
}
