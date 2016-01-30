package interview.dynamicProgramming;

/*
 * Min. no. of insertions to be done into string to make string pallindrome.
 * It can be done through DP,
 * For string[l..h]
 * if string[l] == string[h]  then min insertions are equal to min insertions for string[l+1...h-1]
 * else Min(min(string[l...h-1]), string[l+1...h]) + 1
 */
public class MinNumOfInsertions {

public static int minInsertions(String s) {
	int [][] mat = new int[s.length()][s.length()];
	for(int i = 0; i < s.length(); ++i) {
		mat[i][i] = 0;
	}
	for(int i = 0; i < s.length()-1; ++i) {
		if(s.charAt(i) == s.charAt(i+1)){
			mat[i][i+1] = 0;
		}
		else {
			mat[i][i+1] = 1;
		}
	}
	for(int k = 2; k < s.length(); ++k) {
		for(int i = 0; i < s.length() - k; ++i) {
			if(s.charAt(i) == s.charAt(i+k)){
				mat[i][i+k] = mat[i+1][i+k-1];
			}
			else{
				mat[i][i+k] = Math.min(mat[i+1][i+k], mat[i][i+k-1]) + 1;
			}
		}	
	}
	return mat[0][s.length()-1];
}


public static void main(String [] args) {
	String str = "abcde";
	int numOfInversions = minInsertions(str);
	System.out.println(+numOfInversions);
}

}