class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int lm=0;
        int rm=0;
        int ans=0;
        while(l<r){
            if(heights[l]<=heights[r]){
                    if(lm<heights[l]){
                        int v=heights[l]*(r-l);
                        ans=Math.max(ans,v);
                        lm=heights[l];
                    }
                    l++;
            }
             else{
                    if(rm<heights[r]){
                        int v=heights[r]*(r-l);
                        ans=Math.max(ans,v);
                        rm=heights[r];
                    }
                    r--;
            }
        }
        return ans;
    }
}
