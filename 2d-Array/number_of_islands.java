/*Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

 

Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
Example 2:

Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3 */

class Solution {
    public int numIslands(char[][] grid) {
        
    int row=grid.length,col=grid[0].length;
        boolean[][] visited=new boolean[row][col];
        int count=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]=='1'&&!visited[i][j])
                {
                  bfs(grid,visited,i,j);
                  count+=1;
                  System.out.println(i+" "+j);
                }
            }
        }
        return count;
    }
    
    void bfs(char[][] grid,boolean[][] visited,int row,int col)
    {
        LinkedList<List<Integer>> queue=new LinkedList<>();
        List<Integer> ind=new ArrayList<>();
        ind.add(row);
        ind.add(col);
        queue.add(ind);
        visited[row][col]=true;
        int count=0;
        while(queue.size()!=0)
        {
            List<Integer> arr=queue.poll();
            row=arr.get(0);
            col=arr.get(1);
            int[][] adj={{-1,0},{1,0},{0,-1},{0,1}};
            for(int r=0;r<4;r++)
            {
                int indr=adj[r][0]+row;
                int indc=adj[r][1]+col;
                if(indr>=0&&indr<grid.length&&indc>=0&&indc<grid[0].length&&grid[indr][indc]=='1'&&!visited[indr][indc])
                {
                    
                    visited[indr][indc]=true;
                    List<Integer> ind1=new ArrayList<>();
                    ind1.add(indr);
                    ind1.add(indc);
                    queue.add(ind1);
                }
            }
        }

    }
}
