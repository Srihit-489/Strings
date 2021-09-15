class Solution {
    public int firstUniqChar(String s) {
        HashSet<Character> notvisited = new HashSet<Character>();
        HashSet<Character> visited = new HashSet<Character>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(visited.contains(ch))
                continue;
            if(notvisited.contains(ch)){
                notvisited.remove(ch);
                visited.add(ch);
            }else{
                notvisited.add(ch);
            }
        }
        
        for(int i = 0;i<s.length();i++){
            if(notvisited.contains(s.charAt(i)))
                return i;
        }
        
        return -1;
    }
}
