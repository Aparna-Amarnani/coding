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
