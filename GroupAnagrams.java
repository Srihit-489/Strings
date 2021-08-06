class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> myhash = new HashMap<>();
        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sorted = getString(arr);
            if(myhash.containsKey(sorted)){
                myhash.get(sorted).add(s);
            }else{
                myhash.put(sorted,new ArrayList());
                myhash.get(sorted).add(s);
            }
        }
        
        
        List<List<String>> finallist = new ArrayList<>();
        for(String arr : myhash.keySet()){
            finallist.add(myhash.get(arr));
        }
        return finallist;
    }
    
    public String getString(char[] arr){
        StringBuilder sb = new StringBuilder();
        for(char ch : arr){
            sb.append(ch);
        }
        return sb.toString();
    }
}
