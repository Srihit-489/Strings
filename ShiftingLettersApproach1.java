class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder sb = new StringBuilder(s);
        for(int  i = 0;i<shifts.length;i++){
             String result =  Shift(sb,i+1,shifts[i]);
            sb.setLength(0);
            sb.append(result);
        }
        
        return sb.toString();
    }
    
    public String Shift(StringBuilder sb,int pos,int dist){
        for(int i = 0;i<pos;i++){
            char ch = sb.charAt(i);
            sb.deleteCharAt(i);
            int val = ch;
            val+= dist;
            int start = 'a';
            val-= start;
            char finalvalue =   (char)(start+val%26);
            sb.insert(i,finalvalue);
        }
        
        return sb.toString();
    }
}
