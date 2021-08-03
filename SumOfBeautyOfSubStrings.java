class Solution {
    public int beautySum(String s) {
        int sum  = 0;
        for(int i=0;i<s.length();i++){
            int[] data = new int[26];
            
            for(int j=i;j<s.length();j++){
                data[s.charAt(j)- 'a']++;
                sum += getbeauty(data);
            }
        }
        return sum;
    }
    
    public int getbeauty(int[] data){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<data.length;i++){
            if(data[i] != 0){
                max = Math.max(data[i],max);
                min = Math.min(data[i],min);
            }
        }
        
        return max-min;
    }
}


// The main idea is to maintain an array of char frequency
