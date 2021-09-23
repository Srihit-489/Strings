class Solution {
    public String breakPalindrome(String str) {
        if(str.length() <= 1)
            return "";
      PriorityQueue<String> pq = new PriorityQueue<String>();
        StringBuilder sb = new StringBuilder(str);
      for(int i = 0;i<str.length();i++){
          
          char restore = sb.charAt(i);
          if(str.charAt(i) != 'a'){
              sb.deleteCharAt(i);
              sb.insert(i,"a");
          }else{
              sb.deleteCharAt(i);
              sb.insert(i,"b");
          }
          pq.add(sb.toString());
          sb.deleteCharAt(i);
          sb.insert(i,restore);
      }
        while(pq.size() != 0){
            String current = pq.remove();
            if(!palin(current))
                return current;
        } 
        return "";
    }
    
    public boolean palin(String str){
       // System.out.println(str.length()+str);
        int i = 0;
        int j = str.length()-1;
        while(i < j){
          if(str.charAt(i) != str.charAt(j))
              return false;
            i++;
            j--;
        
        }
        
        return true;
    }
}
