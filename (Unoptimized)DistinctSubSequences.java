class Solution {
    public int numDistinct(String s, String t) {
        int count = getcount(s,t,0,0);
        return count;
    }
    
    public int getcount(String s,String t,int s1,int s2){
        if(s2 == t.length())
            return 1;
        if(s1 == s.length())
            return 0;
        char focus = t.charAt(s2);
        int count = 0;
        for(int i = s1;i<s.length();i++){
            if(s.charAt(i) == focus){
                count += getcount(s,t,i+1,s2+1);
            }
        }
        
        return count;
    }
}
