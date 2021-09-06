class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
      //  HashMap<Character,Integer> myhash = new HashMap<>();
        //myhash.put(keysPressed.charAt(0),releaseTimes[0]);
        char ch = keysPressed.charAt(0);
        int max = releaseTimes[0];
        for(int i = 1;i<keysPressed.length() ; i++){
            int dif = releaseTimes[i] - releaseTimes[i-1];
            if(dif > max){
                max = dif;
                ch = keysPressed.charAt(i);
            }else if(dif == max){
                if(ch < keysPressed.charAt(i))
                    ch = keysPressed.charAt(i);
            }
        }
        
        return ch;
    }
}
