class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int lm=0;
        int rm=0;
        int ans=0;
        while(l<r){
            if(height[l]<=height[r]){
               
                if(lm>height[l]){
                    
                    ans+=lm-height[l];
                }
                else{
                    lm=height[l];
                }
                l++;
            }
            else{
                if(rm>height[r]){
                    ans+=rm-height[r];
                }
                else{
                    rm=height[r];
                }
                r--;
            }

        }
        return ans;
    }
}
