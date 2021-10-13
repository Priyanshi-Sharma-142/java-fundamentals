/*
    Problem Statment : FInd the longest substring which is palindrome of the given string.
    The Algorithm runs in O(n^2) time with space complexity as O(1).
*/

package algorithms.string;

public class LongestPalinSubstring {

	static int longestPalindromeSubstr(String s)
	{
		
		int maxLen = 1;         //the maximum length of substring

		int start = 0;
		int len = s.length();

		int low, high;

		
		for (int i = 1; i < len; ++i) {
			low = i - 1;
			high = i;
			while (low >= 0 && high < len
				&& s.charAt(low)
						== str.charAt(high)) {
				--low;
				++high;
			}
			++low; --high;
			if (s.charAt(low) == s.charAt(high) && high - low + 1 > maxLen) {
				start = low;
				maxLen = high - low + 1;
			}

	    	low = i - 1;
			high = i + 1;
			while (low >= 0 && high < len
				&& s.charAt(low)
						== s.charAt(high)) {
				--low;
				++high;
			}
			++low; 
			--high;
			if (s.charAt(low) == s.charAt(high) && high - low + 1 > maxLen) {
				start = low;
				maxLen = high - low + 1;
			}
		}

		return maxLen;
	}


}
