class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(mat[i][j] == 0){
                    q.offer(new int[]{i,j});
                }else{
                    mat[i][j] = -1;
                }
            }
        }
        int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()){
            int[] curr = q.poll();
            for(int[] d : dir){
                int r = curr[0] + d[0];
                int c = curr[1] + d[1];
                if(r>=0 && c>=0 && r<n && c<m && mat[r][c]==-1){
                    mat[r][c] = mat[curr[0]][curr[1]] +1;
                    q.offer(new int[]{r,c});
                } 
            }
        }
        return mat;
    }
}