/*
You have a graph of n nodes. You are given an integer n and an array edges where 
edges[i] = [aᵢ, bᵢ] indicates that there is an edge between aᵢ and bᵢ in the graph.
Return the number of connected components in the graph.

Example 1:
Input:
n = 5, edges = [[0,1],[1,2],[3,4]]
Output: 2

Example 2:
Input:
n = 5, edges = [[0,1],[1,2],[2,3],[3,4]]
Output: 1

Constraints:
1 <= n <= 2000
1 <= edges.length <= 5000
edges[i].length == 2
0 <= aᵢ <= bᵢ < n
aᵢ != bᵢ
There are no repeated edges.
*/
class Solution {
    public int countComponents(int n, int[][] edges) 
    {
        int vis[]=new int[n];
        Arrays.fill(vis,0);
        int count=0;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        for(int arr[]:edges)
        {
            int i=arr[0];
            int j=arr[1];
            adj.get(i).add(j);
            adj.get(j).add(i);
        }
        for(int i=0; i<n; i++)
        {
            if(vis[i]==0)
            {
                count++;
                dfs(i,n,adj,vis);
            }
        }
        return count;
    }
    public void dfs(int i, int n,List<List<Integer>> adj, int vis[])
    {
        vis[i]=1;
        for(Integer node:adj.get(i))
        {
            if(vis[node]==0)
            {
                vis[node]=1;
                dfs(node,n,adj,vis);
            }
        }
    }
}
