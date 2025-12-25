class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int[] visited = new int[n];
        for(int i=0; i<n; i++){
            visited[i] = 0;
        }
        int provinces = 0;
        for(int j=0 ; j<n ; j++){
            if(visited[j] == 0){
                provinces++;
                dfs(j , isConnected, visited);
            }
        }
        return provinces;
    }
    public void dfs(int node, int[][] isConnected, int[] visited){
        visited[node] = 1;
        for(int k=0; k<isConnected.length; k++){
            if(isConnected[node][k] == 1 && visited[k] == 0){
                dfs(k, isConnected, visited);
            }
        }
        
    }
}