package interview;

public class KMPPatternSearch {

	public  static void hasSubstring(char [] txt, char [] pattern) {
		int lps [] = computelpsArray(pattern);
		int index = 0, i = 0;
		while(i < txt.length && index < pattern.length) {
			if(pattern[index] == txt[i]) {
				index++;
				i++;
			}
			else{
				if(index != 0){
					index = lps[index-1];
				}
				else {
					i++;
				}
			}
		}
		if(index == pattern.length) {
			System.out.println("Pattern found at index = "+ (i - pattern.length));
		}
	}
	
	public static int [] computelpsArray(char [] pattern) {
		int [] arr = new int [pattern.length];
		arr[0] = 0;
		int i = 0;
		int j = 1;
		while(j < pattern.length) {
			if(pattern[i] == pattern[j]) {
				arr[j] = i+1;
				++i;
				++j;
			}
			else {
				
				if(i != 0) {
					i = arr[i-1];
				}
				else{
					arr[j] = 0;
					++j;
				}
			}
		}
		return arr;
	}

    public static void main(String args[]){
    	int [] arr = computelpsArray("ABABCABAB".toCharArray());
    	for(int i = 0; i < arr.length; ++i) {
        	System.out.println(arr[i]);
    	}
    	
    	hasSubstring("ABABDABACDABABCABAB".toCharArray(), "ABABCABAB".toCharArray());
    }
}
