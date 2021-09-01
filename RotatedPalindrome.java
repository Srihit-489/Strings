/*

Given a string, check if it is a rotated palindrome or not.

Input: "CBAABCD"
Output: true
Explanation: "CBAABCD" is a rotation of the palindrome "ABCDCBA"

Input: "BAABCC"
Output: true
Explanation: "BAABCC" is a rotation of the palindrome "ABCCBA"

Input: "DCABC"
Output: false

*/

import java.lang.*;
import java.util.*;

class Solution
{
	
	public static boolean isRotatedPalindrome(String s)
	{
		HashSet<Character> myhash = new HashSet<Character>();
		for(int i = 0;i<s.length();i++){
			if(myhash.contains(s.charAt(i))) myhash.remove(s.charAt(i));
			else myhash.add(s.charAt(i));
		}
		
		return myhash.size() <= 1;
	}
}
