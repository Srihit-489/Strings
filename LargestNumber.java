class Solution {
    public String largestNumber(int[] nums) {
          boolean zero = true;
          PriorityQueue<String> pq = new PriorityQueue<String>(new Comp());
          for(int num : nums){
              pq.add(""+num);
              if(num > 0)
                  zero = false;
          }
          StringBuilder sb = new  StringBuilder();
          while(pq.size() != 0)
              sb.append(pq.remove());
          if(zero)
              return "0";
          return sb.toString();
        
    }
    
    public class Comp implements Comparator<String>{
        public int compare(String s1,String s2){
            int runner1 = 0;
            int runner2 = 0;
            if(s1.equals(s2))
                return 1;
            while(runner1 < s1.length() && runner2 < s2.length()){
                if(s1.charAt(runner1) != s2.charAt(runner2))
                    return s2.charAt(runner2) - s1.charAt(runner1);
                runner1++;
                runner2++;
            }
            if(runner1 == s1.length() && runner2 != s2.length())
                return compare(s1,s2.substring(runner2,s2.length()));
            else
                return compare(s1.substring(runner1,s1.length()),s2);
            
        }
    }
}
