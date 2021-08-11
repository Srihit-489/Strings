class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> myhash = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            myhash.put(ch,myhash.getOrDefault(ch,0)+1);
        }
        int oddmax = 0;
        int sum = 0;
        for(int i : myhash.values()){
            if(i%2 == 1){
                if(i > oddmax){
                    sum+= (oddmax-1) > 0?(oddmax-1):0;
                    oddmax = i;
                }else{
                    sum+= i-1;
                }
                    
            } 
            else
                sum+=i;
        }
        
        sum+=oddmax;
   
        return sum;
    }
}
