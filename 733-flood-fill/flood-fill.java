class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldcolor = image[sr][sc];
        if(oldcolor == color) return image;
        dfs(image, oldcolor, sr, sc, color);
        return image;
    }
    private void dfs(int[][] image,int oldcolor, int sr, int sc,int newcolor){
        int n=image.length;
        int m =image[0].length;
        if(sr<0 || sc<0 || sr>=n || sc>=m) return;
        if(image[sr][sc]!=oldcolor) return;
        image[sr][sc] = newcolor;

        dfs(image, oldcolor, sr+1, sc, newcolor);
        dfs(image, oldcolor, sr-1, sc, newcolor);
        dfs(image, oldcolor, sr, sc+1, newcolor);
        dfs(image, oldcolor, sr, sc-1, newcolor);

    }
}