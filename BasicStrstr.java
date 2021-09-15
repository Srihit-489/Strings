class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0)
             return 0;
        if(haystack.length() < needle.length())
            return -1;
        for(int i = 0;i<haystack.length();i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                int runner = i;
                while(runner != haystack.length() && needle.length() != runner-i && haystack.charAt(runner) == needle.charAt(runner-i))
                    runner++;
                if(runner == i + needle.length())
                    return i;
            }
        }
        return -1;
    }
}
