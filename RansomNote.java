class Solution {
    public boolean canConstruct(String str1, String str2) {
        HashMap<Character,Integer> myhash1 = new HashMap<>();
        HashMap<Character,Integer> myhash2 = new HashMap<>();
        for(int i = 0;i<str1.length();i++){
            myhash1.put(str1.charAt(i),myhash1.getOrDefault(str1.charAt(i),0)+1);
        }
        
        for(int i = 0;i<str2.length();i++){
            myhash2.put(str2.charAt(i),myhash2.getOrDefault(str2.charAt(i),0)+1);
        }
        
        for(int i =0; i<str1.length();i++){
            char cur = str1.charAt(i);
            if(!myhash2.containsKey(cur))
                return false;
            if(myhash2.get(cur) == 0)
                return false;
            myhash2.put(cur,myhash2.get(cur)-1);
        }
        
        return true;
    }
}
