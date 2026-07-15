class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces =0;
        for(int i=0 ; i<n ; i++){
            if(!visited[i]){
                provinces++;
                dfs(i, visited, isConnected);
            }
        }
        return provinces;
    }
    void dfs(int node, boolean[] vis, int[][] graph){
        vis[node] = true;
        for(int i=0 ; i<graph.length ; i++){
            if(graph[node][i] == 1 && !vis[i]){
                dfs(i, vis, graph);
            }
        }
    }
}