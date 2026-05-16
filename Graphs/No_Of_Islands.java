/*
Given a 2D grid grid where '1' represents land and '0' represents water, count and return the number of islands.
An island is formed by connecting adjacent lands horizontally or vertically and is surrounded by water. 
You may assume water is surrounding the grid (i.e., all the edges are water).

Example 1:
Input: grid = [
    ["0","1","1","1","0"],
    ["0","1","0","1","0"],
    ["1","1","0","0","0"],
    ["0","0","0","0","0"]
  ]
Output: 1

Example 2:
Input: grid = [
    ["1","1","0","0","1"],
    ["1","1","0","0","1"],
    ["0","0","1","0","0"],
    ["0","0","0","1","1"]
  ]
Output: 4

Constraints:
1 <= grid.length, grid[i].length <= 100
grid[i][j] is '0' or '1'.
*/
class Pair
{
    int f,s;
    public Pair(int f, int s)
    {
        this.f=f;
        this.s=s;
    }
}
class Solution {
    public int numIslands(char[][] grid) 
    {
        int m=grid.length;
        int n=grid[0].length;
        int vis[][]= new int[m][n];
        for(int arr[]:vis)
        {
            Arrays.fill(arr,0);
        }    
        int count=0;
        for(int i=0; i<m; i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]=='1' && vis[i][j]==0)
                {
                    count++;
                    bfs(i,j,grid,vis);
                }
            }
        }
        return count;
    }
    public void bfs(int i, int j, char grid[][], int vis[][])
    {
        int m=grid.length;
        int n=grid[0].length;
        vis[i][j]=1;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(i,j));
        int delrow[]={-1,0,1,0};
        int delcol[]={0,1,0,-1};

        while(!q.isEmpty())
        {
            int row=q.peek().f;
            int col=q.peek().s;
            q.remove();

            for(int a=0; a<4; a++)
            {
                int nrow=row+delrow[a];
                int ncol=col+delcol[a];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && grid[nrow][ncol]=='1' && vis[nrow][ncol]==0)
                {
                    vis[nrow][ncol]=1;
                    q.add(new Pair(nrow,ncol));
                }
            }
        }
    }
}
