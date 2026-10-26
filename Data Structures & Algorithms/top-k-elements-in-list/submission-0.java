class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));

        for(Map.Entry<Integer,Integer> l:map.entrySet()){
            pq.add(l.getKey());
            if(pq.size()>k){
                pq.remove();
            }

        }
        int ans[]=new int[k];
        int i=0;
        while(!pq.isEmpty()){
            ans[i++]=pq.poll();
        }
        return ans;

    }
}
