import java.lang.*;
import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> myhash = new HashMap<String,List<String>>();
        for(String s : strs){
			char[] arr = s.toCharArray();
			Arrays.sort(arr);
            String encr =  String.valueOf(arr);
			if(!myhash.containsKey(encr))
				myhash.put(encr,new ArrayList<>());
            myhash.get(encr).add(s);
        }
		List<List<String>> mylist = new ArrayList<>();
		for(List<String> list : myhash.values())
			mylist.add(list);

		return mylist;

		
    }
    
}
