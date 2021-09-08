//(Efficeint)

class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = shifts.length - 2; i>= 0 ;i--){
            shifts[i] = shifts[i] + shifts[i+1];
            shifts[i] = shifts[i]%26;
        }
     
        return Shift(sb,shifts);
        
        //return sb.toString();
    }
    
    public String Shift(StringBuilder sb,int[] shifts){
        for(int i = 0;i<shifts.length;i++){
            int start = 'a';
            char ch = sb.charAt(i);
            sb.deleteCharAt(i);
            int val = ch;
            val-= start;
            val+= shifts[i];
            char finalvalue =   (char)(start+val%26);
            sb.insert(i,finalvalue);
        }
        
        return sb.toString();
    }
}
