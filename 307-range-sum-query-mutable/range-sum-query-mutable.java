class NumArray {
    int[] tree;
    int n;

    public NumArray(int[] nums) {
        n = nums.length;
        tree = new int[4*n];
        build(nums, 0, 0, n-1);
    }
    public void build(int[] nums, int node, int start, int end){
        if(start == end){
            tree[node] = nums[start];
            return;
        }
        int mid = (start + end) / 2 ;
        build(nums, 2 * node + 1, start , mid);
        build(nums, 2 * node + 2, mid+1, end);
        tree[node] = tree[2 * node + 1]  + tree[2 * node + 2];
    }
 
    public void update(int index, int val) {
        updateHelper(0, 0, n-1, index, val);
    }
    public void updateHelper(int node, int start, int end, int index, int val){
        if(start == end){
            tree[node] = val;
            return;
        }
        int mid = (start + end) / 2;
        if(index <= mid){
            updateHelper(2 * node + 1, start, mid, index, val);
        }else{
            updateHelper(2 * node + 2, mid+1, end , index , val);
        }
        tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
    }
    
    public int sumRange(int left, int right) {
        return query(0, 0 ,n-1, left, right);
    }
    public int query(int node, int start, int end , int left, int right){
        if(right < start || end < left){
            return 0;
        }
        if(left <= start && end <= right){
            return tree[node];
        }
        int mid = (start + end)/2;
        int leftSum = query(2 * node + 1, start, mid, left , right);
        int rightSum = query(2 * node + 2 , mid+1 , end , left, right);
        return leftSum + rightSum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */