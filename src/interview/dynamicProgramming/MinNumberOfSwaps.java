package interview.dynamicProgramming;

/* ACTUALLY ITS NOT A DP PROBLEM
 * Min. no. of adjacent swaps to be done into string to make string palindrome.
 * The logic is to try to make end characters equal
 * If the first and last characters are not equal, the right most character equal to the first character 
 * should be found and swapped right till the end
 * And the same should be done on the string after stripping the end characters
 * If there is no other character for the first element in the string then it may lie in the middle of the
 * palindrome, so we should proceed with the string[l+1...h], and make it palindrome, and swap the first element to the center
 * If while doing this there is another lone character then its impossible to make string palindrome 
 */

public class MinNumberOfSwaps {

	public static void swap(char[] chars, int start, int end) {
		if(end==start||end<start||end>chars.length||start > chars.length ||end<0 || start< 0) {
			return;
		}
		
		while(start<end) {
			char t = chars[start];
			chars[start] = chars[start+1];
			chars[start+1] = t;
			start = start+1;
		}
	}
	public static int minSwaps(String s) {
		int count = 0;
		int loneCharacter = 0;
		int end = s.length()-1;
		char [] chars = s.toCharArray();
		for(int i = 0; i < chars.length && loneCharacter < 2; ++i) {
			if(chars[i] != chars[end]){
				boolean matchFound = false;
				for(int j = end - 1; j >= i + 1; --j ) {
					if(chars[j] == chars[i]){
						count += end - j;
						swap(chars, j, end);
						matchFound = true;
						break;
					}
				}
				if(!matchFound) {
					loneCharacter++;
				}
			}
			end = end - 1;
		}
		if(loneCharacter < 2) {
			return count;
		}
		System.out.println("Not possible");
		return 0;
	}


	public static void main(String [] args) {
		String str1 = "mamad";
		int numOfInversions = minSwaps(str1);
		System.out.println(str1 + "->" +numOfInversions);
		System.out.println("asflkj" + "->" +minSwaps("asflkj"));
		System.out.println("aabb" + "->" +minSwaps("aabb"));

	}

}
