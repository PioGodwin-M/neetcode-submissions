class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            int[] arr=new int[26];
            String s=strs[i];
            for(int j=0;j<s.length();j++){
                arr[s.charAt(j)-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int t=0;t<26;t++){
                sb.append(arr[t]);
                sb.append("#");
            }
            String key=sb.toString();
            map.computeIfAbsent(key,k->new ArrayList<>());
            map.get(key).add(s);
        }

        List<List<String>> ans=new ArrayList<>();
        for(List<String> l:map.values()){
               ans.add(l);
        }
        return ans;
    }
}
