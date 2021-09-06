class Solution {
    public int minPartitions(String str) {
        int current = 0;
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            int num = Character.getNumericValue(str.charAt(i));
            if(current < num)
                current = num;
        }
        
        return current;
    }
}
