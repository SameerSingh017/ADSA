class Solution {
    public int orangesRotting(int[][] grid) {
        int n= grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        int time = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i,j,0});
                }else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        if(fresh == 0) return 0;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        while(!q.isEmpty()){
            int size = q.size();
            boolean rotten = false;
            for(int i=0; i<size; i++){
                int[] curr_index = q.poll();
                for(int[] dir : dirs){
                    int r = curr_index[0] + dir[0];
                    int c = curr_index[1] + dir[1];
                    if(r>=0 && r<n && c>=0 && c<m && grid[r][c] == 1){
                        grid[r][c] = 2;
                        q.add(new int[]{r,c,0});
                        fresh--;
                        rotten = true;
                    }
                }
            }
            if(rotten) time++;
        }
        if(fresh==0) return time;
        else return -1;
        
    }
}