/* Given a matrix mat of size N x M where every element is either O or X.
Replace all O with X that are surrounded by X.
A O (or a set of O) is considered to be surrounded by X if there are X at locations just below, just above, just left and just right of it. */
class Solution {
    public void solve(char[][] board) {
        int m=board.length,n=board[0].length;
        for(int i=0;i<n;i++)
        {
            if(board[0][i]=='O')
            {
                region(board,0,i);
            }
             if(board[m-1][i]=='O')
            {
                region(board,m-1,i);
            }
        }
        for(int i=0;i<m;i++)
        {
            if(board[i][0]=='O')
            {
                region(board,i,0);
            }
             if(board[i][n-1]=='O')
            {
                region(board,i,n-1);
            }
        }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]=='O')
                {
                    board[i][j]='X';
                }
                else if(board[i][j]=='t')
                {
                    board[i][j]='O';
                }
                else
                continue;
            }
        }
    }
    void region(char[][] board,int r,int c)
    {
            if(!(r>=0&&r<board.length&&c>=0&&c<board[0].length&&board[r][c]=='O'))
            {
                return;
            }
            else
            {
                board[r][c]='t';
                region(board,r+1,c);
                region(board,r-1,c);
                region(board,r,c-1);
                region(board,r,c+1);
            }
    }
}
