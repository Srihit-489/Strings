class Solution {
    public String largestOddNumber(String num) {
        int end = -1;
        for(int i=0;i<num.length();i++){
            if(Character.getNumericValue(num.charAt(i))%2 == 1){
                end = i;
            }
        }
        
        return end == -1?"":num.substring(0,end+1);
    }
}
