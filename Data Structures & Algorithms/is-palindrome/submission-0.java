class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        int r=s.length()-1;

        
        while(l<r){
            char c1=Character.toLowerCase(s.charAt(l));
            char c2=Character.toLowerCase(s.charAt(r));
            if(!((c1>='a' && c1<='z') || (c1>='A' && c1<='Z') || (c1>='0' && c1<='9') )){
                l++;
                continue;
            }
            if(!((c2>='a' && c2<='z') || (c2>='A' && c2<='Z') || (c2>='0' && c2<='9') )){System.out.println(c2);
                r--;
                continue;
            }

            if(c1!=c2){
                System.out.println(c1);
                
             return false;
            }
         l++;
         r--;
        }
        return true;
    }
}
