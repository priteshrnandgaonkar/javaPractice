package interview;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import interview.longestChainMatchingString.StringChain;

/*
 * Given a dictionary, and two words ‘start’ and ‘target’ (both of same length). 
 * Find length of the smallest chain from ‘start’ to ‘target’ if it exists, 
 * such that adjacent words in the chain only differ by one character and each 
 * word in the chain is a valid word i.e., it exists in the dictionary. 
 * It may be assumed that the ‘target’ word exists in dictionary and length of all dictionary words is same.
 */

public class longestChainMatchingString {
	
	
	
	public static boolean isAdjacent(String baseString, String adjacentString) {
		
		if(baseString.length() != adjacentString.length()) {
			return false;
		}
		
		int count = 0;
		for(int i = 0; i < baseString.length(); ++i) {
			if(baseString.charAt(i) != adjacentString.charAt(i)) {
				count=count+1;
			}
			if(count > 1){
				return false;
			}
		}

		return count==1;
	}
	
	public static void longestMatchingString(ArrayList<String> dict, String start, String target) {
//		Iterator<String> iterator = dict.iterator(); 
		Queue <StringChain> queue = new LinkedList<StringChain>();
		StringChain chain = new StringChain(start);
		queue.add(chain);
		
		int count =0;
		while(!queue.isEmpty()) {
			count++;
			StringChain temp = queue.remove();
			for(int i = 0; i < dict.size(); ++i) {
				String iteratedString = dict.get(i);
				if(isAdjacent(temp.endString,iteratedString)){
					ArrayList<String> chainList = (ArrayList<String>)temp.chainString.clone();
					chainList.add(iteratedString);
					StringChain chainToPush = new StringChain(iteratedString, chainList);
					queue.add(chainToPush);
					dict.remove(iteratedString);
					
					if(chainToPush.endString == target) {
						chainToPush.printChain();
						return;
					}
				}
			}
		}
		System.out.println("No chain found");
	}

	public static void main(String [] args) {
		ArrayList<String> D = new ArrayList<String>();
		D.add("tlkn");
		D.add("pokn");
	    D.add("poon");
	    D.add("plee");
	    D.add("same");
	    D.add("poie");
	    D.add("plie");
	    D.add("poin");
	    D.add("plea");

	    longestMatchingString(D, "tlkn", "plea");
	 
	}
	public static class StringChain {
		String endString;
		ArrayList<String> chainString;
		
		public StringChain(String _endString) {
			this.endString = _endString;
			this.chainString = new ArrayList<String>();
			this.chainString.add(_endString);
		}
		
		public StringChain(String _endString, ArrayList<String> _list) {
			this.endString = _endString;
			this.chainString = _list;
		}
		
		public void addToChain(String s) {
			this.chainString.add(s);
		}
		
		public void printChain() {
			for(int i = 0; i < this.chainString.size(); ++i) {
				if(i < this.chainString.size()-1) {
					System.out.print(this.chainString.get(i)+"-");
				}
				else{
					System.out.print(this.chainString.get(i));
				}
			}
		}
	}
}

