/*
You are given a matrix grid where grid[i] is either a 0 (representing water) or 1 (representing land).
An island is defined as a group of 1's connected horizontally or vertically. You may assume all four edges of the grid are surrounded by water.
The area of an island is defined as the number of cells within the island.
Return the maximum area of an island in grid. If no island exists, return 0.

Example 1:
Input: grid = [
  [0,1,1,0,1],
  [1,0,1,0,1],
  [0,1,1,0,1],
  [0,1,0,0,1]
]
Output: 6
Explanation: 1's cannot be connected diagonally, so the maximum area of the island is 6.

Constraints:
1 <= grid.length, grid[i].length <= 50
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
    public int maxAreaOfIsland(int[][] grid) 
    {
        int m=grid.length;
        int n=grid[0].length;
        int vis[][]= new int[m][n];
        int max=0;
        for(int arr[]:vis)
        {
            Arrays.fill(arr,0);
        }    
        int count=0;
        for(int i=0; i<m; i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1 && vis[i][j]==0)
                {
                    int ans=bfs(i,j,grid,vis);
                    if(ans>max)
                        max=ans;
                }
            }
        }
        return max;   
    }
    public int bfs(int i, int j, int grid[][], int vis[][])
    {
        int m=grid.length;
        int n=grid[0].length;
        vis[i][j]=1;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(i,j));
        int delrow[]={-1,0,1,0};
        int delcol[]={0,1,0,-1};
        int count=1;
        while(!q.isEmpty())
        {
            int row=q.peek().f;
            int col=q.peek().s;
            q.remove();

            for(int a=0; a<4; a++)
            {
                int nrow=row+delrow[a];
                int ncol=col+delcol[a];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && grid[nrow][ncol]==1 && vis[nrow][ncol]==0)
                {
                    count++;
                    vis[nrow][ncol]=1;
                    q.add(new Pair(nrow,ncol));
                }
            }
        }
    
        return count;
    }
}
