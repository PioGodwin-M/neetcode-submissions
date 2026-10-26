class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] p=new int[nums.length];
        int[] s=new int[nums.length];
        int t=nums.length-1;
        for(int i=0;i<nums.length;i++){
            
            if(i==0){
                p[i]=1;
                s[t--]=1;
                continue;
            }
            p[i]=p[i-1]*nums[i-1];
            s[t]=s[t+1]*nums[t+1];
            t--;

        }
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
             ans[i]=p[i]*s[i];
        }
        return ans;
    }
}  
