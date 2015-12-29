package interview;

public class Palindrome {
	
/*
 * O(n2) dynamic programming solutions
 */
	public static boolean longestPalindrome(char [] charArray) {
		boolean hasPalindrome = false;
		boolean table [][] = new boolean[charArray.length][charArray.length];
		int maxlength = 0;
		int startIndex = 0;
		for(int i = 0; i < charArray.length; ++i) {
			table[i][i] = true;
			startIndex = i;
			maxlength = 1;
			hasPalindrome = true;
		}
		for(int i = 0; i < charArray.length-1; ++i) {
			table[i][i+1] = charArray[i] == charArray[i+1];
			startIndex = i;
			maxlength = 2;
		}
		
		for(int k = 3; k <= charArray.length; ++k) {
			for(int i = 0 ; i < charArray.length-k+1; ++i) {
				int j = i + k - 1;
				table[i][j] = charArray[i] == charArray[j] ? table[i+1][j-1] : false;
				if(table[i][j] && k > maxlength) {
					startIndex = i;
					maxlength = k;
				}
			}
		}
		System.out.println("Longest Palindrome is at startIndex = "+ startIndex+ " with length = "+ maxlength);
		return hasPalindrome;
	}
	
	   public static void main(String args[]){
		   longestPalindrome("jeeksskeeg".toCharArray());
	    }
}
