class Solution {
    public boolean isIsomorphic(String s, String t) {
       if(s.length() > t.length()){
           return false;
       }
       HashMap<Character,Character> myhash = new HashMap<>();
       for(int i=0;i<s.length();i++){
           if(myhash.containsKey(s.charAt(i))){
               if(myhash.get(s.charAt(i)) != t.charAt(i))
                   return false;
           }else if(!myhash.containsValue(t.charAt(i))){
               myhash.put(s.charAt(i),t.charAt(i));
           }else{
               return false;
           }
    
       }
        return true;
        
    }
}
