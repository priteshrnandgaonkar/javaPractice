/**
 * 
 */
package com.LinkedList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import javax.swing.DefaultBoundedRangeModel;

import com.LinkedList.Tree.Node;
import com.LinkedList.Tree.Tree;
import com.LinkedList.interfaceExample.CallBackImpl;
import com.LinkedList.interfaceExample.Caller;
import java.util.Random;

/**
 * @author priteshnandgaonkar
 *
 */

public class Main {

	/**
	 * @param args
	 */
	 static int num = 0;
	 static int numOFInversions = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkeList lt = new LinkeList("root");
		lt.add("1");
		lt.add("2");
		lt.add("3");
		System.out.println(lt.printLinkedList());
		com.LinkedList.Node n = reverseLinkedList(lt.getHead());
		com.LinkedList.Node iterator = n;
		System.out.println("Reversed list =");
		while(iterator != null) {
			System.out.print(iterator.getData().toString() + "->");
			iterator = iterator.getNext();
		}
		
		System.out.println("");
		Dog maxDog = new Dog("MAX", 6);
		foo(maxDog);
		System.out.println("Dog = "+maxDog.name);
		
		int arr[] = {45,32,23,21,1};//{1, 2, 3, 4, 5, 19, 21, 34, -1, -56};//{5,  9 , 13, 14, 1, 3};
		int circularlySortedArray [] =  {62, 63, 64, -5, 6, 7, 8, 10}; //{5,  9 , 13, 14, 1, 3}; //{18, 19, 4, 5, 17}; 
		System.out.println("Max in circular array -> " + findMaxInCircularSortedArray(circularlySortedArray, 0, circularlySortedArray.length-1));
		String arr1[] = {"a","b","c"};
		
		printPowerSetForGivenNumber(arr1);
		
		System.out.println(+randomGenrator());
		System.out.println(reverseEntireString("Pritesh"));
		System.out.println(reverseSpaceBasedString("Pritesh Nandgaonkar"));
		
		Set<Integer> s = new HashSet<Integer>();
		int arrayInts [] = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println(+maxContiguousSum(arrayInts));
		
		Caller caller = new Caller();
	    CallBackImpl callBack = new CallBackImpl();
	    caller.register(callBack);
	    
	    
	    Node t = new Node("5", null, null);
	    t.addLeft("1");
	    t.addRight("5");
	    t.getRight().addRight("5");
	    t.getLeft().addLeft("3");
	    t.getLeft().addRight("4");
	    
	    Node t2 = new Node("1", null, null);
	    t2.addLeft("3");
	    t2.addRight("2");
	    t2.getRight().addRight("6");
	    t2.getRight().addLeft("5");
	    t2.getLeft().addLeft("4");
	    t2
	    .getLeft().addRight("7");
	    System.out.println("---------------------Spiral Binary tree --------------------------------");

	    printSpiralBinaryTree(t2);
	    
	    System.out.println("---------------------Spiral Binary tree --------------------------------");

	    System.out.println("Number of singly Value tree "+ num);

	    numberOfSinglyTree(t);
	    
	    System.out.println("Number of singly Value tree "+ num);
	    System.out.println("Preorder traversal "+preorderTraversal(t));
	    System.out.println("Inorder traversal "+inorderTraversal(t));
//	   inorderTraversalIterative(t);

	    //Insertion Sort annd bubbleSort
	    int [] arrayToBeSorted = {2, 1, -88, -9, 4};
	    int [] sortedArray = bubbleSort(arrayToBeSorted);
    	System.out.print("InsertionSort :- ");

	    for(int i = 0; i < sortedArray.length; ++i) {
	    	System.out.print(sortedArray[i]);
	    }
    	System.out.println("");

	    int [] arrayToBeSorted2 = {1, 3, 8, 5, 7, 2, 4, 6};

	    int [] sortedArray2 = numOfInversions(arrayToBeSorted2);
	    
    	System.out.print("MergeSort :- ");
	    for(int i = 0; i < sortedArray2.length; ++i) {
	    	System.out.print(sortedArray2[i]);
	    }
	    System.out.println("Number Of Inversions "+ numOFInversions);
	    demo();
	    
	    int [] val = {60, 100, 120};
	    int [] wt = {10, 20, 30};
	    int  W = 50;
	    int knapSackVal = knapSack(val,wt, W, val.length);
	    System.out.println("KnapSack Value = "+ knapSackVal);
	    
	    int [] arr2 = {1, 2, 3};
	    int m = arr2.length;
	    int N = 4;
	    int count4 = coinCount(arr2, m, N);
	    System.out.println("Coin count = " + count4);
	    
	    int coins[] =  {9, 6, 5, 1};
	    int V = 11;
	  System.out.println( "Minimum coins required is "+minCoins(coins, V));
	  String geeks = "geeksforgeeks";
	  System.out.println(removeDuplicates(geeks));
	  
	  int array []= new int[2];
	  array[0] = 100;
	  array[1] = 'A';

	  System.out.println(array[0]); //Prints the number at index zero.

	  //Is it %c to print a char?
	  System.out.println(array[1]); //Prints the number at index zero as it's equivalent char.
	  
	  permutation("prit");
	  
	  int [][] mat = { {0, 1, 1, 0},
	  				   {1, 0, 0, 1},
	  				   {1, 0, 0, 1},
	  				   {0, 1, 1, 0},
	  					};
	  
	  int [][] topoMat = { {0, 0, 0, 0, 0, 0},
				   {0, 0, 1, 0, 0, 0},
				   {0, 0, 0, 1, 0, 0},
				   {0, 0, 0, 0, 0, 0},
				   {1, 0, 0, 1, 0, 0},
				   {1, 1, 0, 0, 0, 0}
					};
	  dfs(mat);
		System.out.println("---------");
		
		System.out.println("Topo---------");
		
		topologicalSort(topoMat);
		System.out.println("Topo---------");

	 bfs(mat);
	  
	  printJumpingNumbers(105);
	  
	  char grid[][] = {"GEEKSFORGEEKS".toCharArray(),
              "GEEKSQUIZGEEK".toCharArray(),
              "IDEQAPRACTICE".toCharArray()
             };
	  System.out.println("--------------FindPattern-------------");
	  findPattern(grid, "EEE");
	  System.out.println("--------------FindPattern-------------");

	}
	    
	    

	public static void foo(Dog d) {
		d.setName("dfjgdg");

	}
		
	//Maximum contiguous sum and its indices from array
	public static int maxContiguousSum(int arr[]){
		int maxSoFar = arr[0];
		int maxEndingAtIndexArray [] = new int[arr.length];
		maxEndingAtIndexArray[0] = arr[0];
		for(int i = 1; i < arr.length; ++i) {
			maxEndingAtIndexArray[i] = Math.max(maxEndingAtIndexArray[i-1] + arr[i], arr[i]);
			if(maxSoFar < maxEndingAtIndexArray[i]){
				maxSoFar = maxEndingAtIndexArray[i];
			}
		}
		return maxSoFar;
	}
	
	//Reversing string based on spaces
	public static String reverseSpaceBasedString(String str) {
		String parts [] = str.split(" ");
		for(int i = 0; i < parts.length; ++i ){
			parts[i] = reverseEntireString(parts[i]);
		}
		String finalString = parts[0];
		for(int i = 1; i < parts.length; ++i ){
			finalString +=" " + parts[i];
		}
		return finalString;
	}
	
	//Reverse a string
	public static String reverseEntireString(String str) {
		char stringChars [] = new char[str.length()];
		for(int i = str.toCharArray().length - 1; i >= 0; --i) {
			stringChars[str.toCharArray().length - 1 - i] = str.toCharArray()[i];
			System.out.println(stringChars[str.toCharArray().length - 1 - i]);
		}
		return new String(stringChars);
	}
	//Random number generator between 1 to 7 given random num generator in 1 to 5
	public static int randomGenrator(){
		int mat [][] = {{1,2,3,4,5},
				{6,7,1,2,3},
				{4,5,6,7,1},
				{2,3,4,5,6},
				{7,0,0,0,0}	
		};
		Random r1 = new Random();
		Random r2 = new Random();
		return mat[r1.nextInt(5)][r2.nextInt(5)];
	}
	
	// Powerset problem, iterative solution
	public static void printPowerSetForGivenNumber(String baseSet []) {
		
		for(int i = 0; i<Math.pow(2, baseSet.length); ++i){
			System.out.print("{");
			for(int j=0; j<baseSet.length; ++j) {
				
				if((i & (1<<j)) == 1<<j) {
					System.out.print(""+baseSet[j]+ ",");
				}
			}
			System.out.println("}");
		}
	}

	// Maximum in circularly sorted array
	public static int findMaxInCircularSortedArray(int array[], int low, int high) {
		int n = array.length;
		if(high < low) {
			return array[0];
		}

		int mid = (int)((low+high)/2.0);
		System.out.println(""+mid);
		if(array[(mid+1)%n] < array[mid%n] && array[(mid-1)%n] < array[mid%n]) {
			return array[mid%n];
		}
		if(array[mid % n] < array[(mid+1)%n] && array[mid % n] < array[(mid-1)%n]) {
			return array[(mid-1)%n];
		}
		if(array[(mid+1)%n] > array[mid % n] && array[(mid+1)%n] > array[(mid+2)%n]) {
			System.out.println("mid+1 is highest");
			return array[(mid+1)%n];
		}
		if(array[(mid+1)%n] > array[mid%n]) {
			return findMaxInCircularSortedArray(array, (mid+1)%n, high);
		}
		
		else {
			return findMaxInCircularSortedArray(array, low, (mid-1)%n);
		}
	}
	
	//Given a binary tree, write a program to count the number of Single 
	//Valued Subtrees. A Single Valued Subtree is one in which all the nodes have
	//same value. Expected time complexity is O(n).
	public static boolean numberOfSinglyTree(Node t) {
		if(t == null){
			return true;
		}
		
		boolean leftTree = numberOfSinglyTree(t.getLeft());
		boolean rightTree = numberOfSinglyTree(t.getRight());

		if(leftTree && rightTree && (t.getLeft() == null || t.getLeft().getData() == t.getData()) && (t.getRight() == null || t.getRight().getData() == t.getData())) {
			num = num + 1;
			return true;
		}
		return false;
	}

	//preordertraversal
	public static String preorderTraversal(Node root){
		if(root == null) {
			return "";
		}
		String nodeString = ""+root.getData();
		nodeString += root.getLeft() != null ? "," + preorderTraversal(root.getLeft()) : "";
		nodeString += root.getRight() != null ? "," + preorderTraversal(root.getRight()) : "";

		return nodeString;
	}
	
	//inorder
	public static String inorderTraversal(Node root){
		if(root == null) {
			return "";
		}
		String nodeString = "";
		nodeString += root.getLeft() != null ? inorderTraversal(root.getLeft()) : "";
		nodeString += root.getData()+",";
		nodeString += root.getRight() != null ? inorderTraversal(root.getRight()) : "";

		return nodeString;
	}
	
	//inorder tree traversal without recursion
	public static void inorderTraversalIterative(Node root){
		HashMap<Node, Boolean> map = new HashMap<>();
		Stack <Node> stack = new Stack <Node>();
		stack.push(root);
		map.put(root, false);
		
		while(!stack.isEmpty()) {
			Node currentNode = stack.pop();
			if(map.get(currentNode)) {
				System.out.println(""+currentNode.getData()+",");
			}
			else{
				if(currentNode.getLeft() != null)
					stack.push(currentNode.getLeft());
				stack.push(currentNode);
				if(currentNode.getRight() != null)
					stack.push(currentNode.getRight());
				map.put(currentNode, true);
			}
		}
//		if(root == null) {
//			return "";
//		}
//		String nodeString = "";
//		nodeString += root.getLeft() != null ? inorderTraversal(root.getLeft()) : "";
//		nodeString += root.getData()+",";
//		nodeString += root.getRight() != null ? inorderTraversal(root.getRight()) : "";

	}
	
	//Insertion Sort

	public static int [] insertionSort(int [] array) {
		
		if(array.length <= 1){
			return array;
		}
	int lastElement = array[array.length-1];
	int [] subArray = new int[array.length-1];
	System.arraycopy(array, 0, subArray, 0, array.length-1);
	subArray = insertionSort(subArray);

	for(int i = 0; i < subArray.length; ++i){
		if(lastElement < subArray[i]) {
			
			for(int k = i; k < subArray.length; ++k) {
				array[k+1] = subArray[k];
			}
			array[i] = lastElement;
			break;
		}
		array[i] = subArray[i];
	}
	return array;
}
	//overlapping rectangle
	public static boolean doesRectOverlap(int a1, int b1, int a2, int b2, int a3, int b3, int a4, int b4) {
		
		if(a2 > a4 || a3 > a2) {
			return false;
		}
		
		if(b1 < b4 || b3 < b2 ) {
			return false;
		}
		return true;
	}
	//BubbleSort
	public static int [] bubbleSort(int [] array) {
		boolean swapped = false;
		for(int i = 0; i < array.length - 1; ++i) {
			for(int j = 0; j < array.length - i - 1; ++j) {
				if(array[j] > array[j + 1]) {
					swapped = true;
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
			if(!swapped)
				break;
		}
		return array;
	}
	 //SelectionSort
	public static int [] selectionSort(int [] array) {
		
		for(int j = 0; j < array.length; ++j) {
			int min = array[j];
			int index = j;
			for(int k = j+1; k < array.length; ++k) {
				if(min > array[k]) {
					min = array[k];
					index = k;
				}
			}
			if(j != index) {
				int temp = array[j];
				array[j] = array[index];
				array[index] = temp;
			}
		}
		
		return array;
	}
	
	//number if inversions , mergesort
	public static int [] numOfInversions(int [] array) {
	    
		if(array.length <= 1){
			return array;
		}
		 if(array.length == 2) {
			 if(array[0] > array[1]) {
				 numOFInversions = numOFInversions + 1;
				 int temp = array[1];
				 array[1] = array[0];
				 array[0] = temp;
			 }
			 return array;
		 }
		 
		 int [] leftHalfArray = new int[array.length / 2];
		 int [] rightHalfArray = new int[array.length - array.length / 2];
		 System.arraycopy(array, 0, leftHalfArray, 0, array.length / 2);
		 System.arraycopy(array, array.length / 2, rightHalfArray, 0, array.length - array.length / 2);
		 leftHalfArray = numOfInversions(leftHalfArray);
		 rightHalfArray = numOfInversions(rightHalfArray);
		 
		 int [] finalArray = new int[array.length];
		 int numOfElementsAdded = 0;
		 int leftArrayIndex = 0;
		 int rightArrayIndex = 0;
		 while(numOfElementsAdded < array.length){
			 if(leftArrayIndex < leftHalfArray.length && rightArrayIndex < rightHalfArray.length) {
				 if(leftHalfArray[leftArrayIndex] < rightHalfArray[rightArrayIndex]){
		
						 finalArray[numOfElementsAdded] = leftHalfArray[leftArrayIndex];
						 leftArrayIndex = leftArrayIndex + 1;
				 }
				 else{
						 finalArray[numOfElementsAdded] = rightHalfArray[rightArrayIndex];
						 rightArrayIndex = rightArrayIndex + 1;
						 numOFInversions = numOFInversions + leftHalfArray.length - leftArrayIndex;
				 }
			 }
			 else if(leftArrayIndex >= leftHalfArray.length){
				 finalArray[numOfElementsAdded] = rightHalfArray[rightArrayIndex];
				 rightArrayIndex = rightArrayIndex + 1;
			 }
			 else if(rightArrayIndex >= rightHalfArray.length){
				 finalArray[numOfElementsAdded] = leftHalfArray[leftArrayIndex];
				 leftArrayIndex = leftArrayIndex + 1;
			 }
			 numOfElementsAdded = numOfElementsAdded + 1;
		 }
			return finalArray;
	}
	
	//	Checking pass by value and ference type
	private static void demo() {
	    int[] array = new int[5];
	    int check = 9;
	    System.out.println(Arrays.toString(array)); // 0, 0, 0, 0, 0
	    System.out.println(+check);

	    fillArray(array,check);
	    System.out.println(+check);

	    System.out.println(Arrays.toString(array)); // 0, 1, 2, 3, 4
	}

	private static void fillArray(int[] array, int x) {
		x = 4;
	    for (int i = 0; i < array.length; i++) {
	        array[i] = i;
	    }
	}
	
	//Reverse a linkedList
	public static com.LinkedList.Node reverseLinkedList(com.LinkedList.Node  currentNode)  
	 {  
	// For first node, previousNode will be null  
		com.LinkedList.Node previousNode=null;  
		com.LinkedList.Node nextNode;  
	  while(currentNode!=null)  
	  {  
	   nextNode=currentNode.getNext();  
	  // reversing the link  
	   currentNode.next=previousNode;  
	  // moving currentNode and previousNode by 1 node  
	   previousNode=currentNode;  
	   currentNode=nextNode;  
	  }  
	  return previousNode;  
	 }
	
	public static int  knapSack(int [] val, int [] wt, int W, int n) {
		
		if(n == 0 || W == 0) {
			return 0;
		}
		
		if(wt[n - 1] > W && n > 1) {
			return knapSack(val, wt, W, n-1);
		}
		
		return Math.max(knapSack(val, wt, W, n-1), knapSack(val, wt, W-wt[n-1], n-1) + val[n-1]);
	}
	
	//coin change problem, printing the count of ways to make chuttas
	public static int coinCount(int [] S, int m, int n) {
		
	    int i,j,x,y;
	    // We need n+1 rows as the table is consturcted in bottom up manner using 
	    // the base case 0 value case (n = 0)
	    int [][] table = new int[n + 1][m];
	    for (i=0; i<m; i++)
	        table[0][i] = 1;
	 
	    // Fill rest of the table enteries in bottom up manner  
	    for (i = 1; i < n+1; i++)
	    {
	        for (j = 0; j < m; j++)
	        {
	            x = (i-S[j] >= 0)? table[i - S[j]][j]: 0;
	 
	            y = (j >= 1)? table[i][j-1]: 0;
	 
	            table[i][j] = x + y;
	        }
	    }
	    return table[n][m-1];
	}
	
	//min no. of coin changes
	public static int minCoins(int [] S, int n) {
		int min = 0;
		int [] arr = new int[n + 1];
		arr[0] = 0;

		for(int i = 1; i < n+1; ++i) {
			int minValue = Integer.MAX_VALUE;
			for(int k = 0;k < S.length; ++k) {
				if(i >= S[k]) {
					int localMin = 1 + arr[i - S[k]];
					if(localMin < minValue) {
						minValue = localMin;
					}
				}
			}
			arr[i] = minValue;
			}
		return arr[n];
	}
	
	public static String removeDuplicateswithNoOrder(String str) {
	    int charsCount[] = new int[256];

	    for (int i = 0; i < str.length(); i++) {
	        char ch = str.charAt(i);
	        charsCount[ch]++;
	    }
	    
	    StringBuilder sb = new StringBuilder(charsCount.length);
	    for (int i = 0; i < charsCount.length; i++) {
	        if (charsCount[i] > 0) {
	            sb.append((char)i);
	        }
	    }

	    return sb.toString();
	}
	public static String removeDuplicates(String str) {
	    boolean seen[] = new boolean[256];
	    StringBuilder sb = new StringBuilder(seen.length);

	    for (int i = 0; i < str.length(); i++) {
	        char ch = str.charAt(i);
	        if (!seen[ch]) {
	            seen[ch] = true;
	            sb.append(ch);
	        }
	    }
	    
	    return sb.toString();
	}
	
	public static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
	
	public static void dfs(int [][] adjMatrix){
		printDFS(adjMatrix, 0);
	}
	
	public static void bfs(int [][] adjMatrix) {
		printBFS(adjMatrix, 0);
	}
	public static void printBFS(int [][] adjMatrix, int source) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(source);
		boolean [] visited = new boolean[adjMatrix.length];
		System.out.println(+source);
		visited[source] = true;
		while(!queue.isEmpty()) {
			int element = queue.remove();
			for(int j = 0; j < adjMatrix[element].length; ++j){
				
				if(!visited[j] && adjMatrix[element][j] == 1) {
					queue.add(j);
					visited[j] = true;
					System.out.println(+j);
				}
			}
		}
		
	}
	public static void printDFS(int [][] adjMatrix, int source) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(source);
		boolean [] visited = new boolean[adjMatrix.length];
		while(!stack.isEmpty()) {
			int element = stack.pop();
			if(!visited[element])
				System.out.println(+element);
			visited[element] = true;
			for(int j = 0; j < adjMatrix[element].length; ++j){
				
				if(!visited[j] && adjMatrix[element][j] == 1) {
					stack.push(j);
				}
			}
		}
	}
	
	public static void printJumpingNumbers(int num) {
		for(int i = 1; i < 10; ++i) {
			printJumpingNumbersUtil(i, num);
		}
	}
	
	public static void topologicalSortUtil(int [][] mat, int root,Stack <Integer> stack, boolean [] visited) {
		
		visited[root] = true;
		for(int i = 0; i < visited.length; ++i) {
			if(mat[root][i] == 1 && !visited[i]) {
				System.out.println("root -" + root + "loop -" + i);
				topologicalSortUtil(mat, i, stack, visited);
			}
		}	
		stack.add(root);
	}
	
	public static void topologicalSort(int [][] mat) {
		
		Stack <Integer> stack = new Stack<Integer>();
		boolean visited [] = new boolean [mat.length];
		for(int j = 0; j < visited.length; ++j) {
			visited[j] = false;
		}
        
        // Mark all the vertices as not visited			
		for(int j = 0; j < visited.length; ++j) {
			if(!visited[j]) {
				topologicalSortUtil(mat, j, stack, visited);
			}
		}
		
		while(!stack.isEmpty()) {
			System.out.println(+stack.pop());
		}
	}
	
	public static void printSpiralBinaryTree(Node root) {
		Stack <Node> leftStack = new Stack<Node>();
		Stack <Node> rightStack = new Stack<Node>();
		System.out.print(root.getData());
		if(root.getLeft() != null) {
			System.out.print(root.getLeft().getData());
			leftStack.add(root.getLeft());
		}
		
		if(root.getRight() != null) {
			System.out.print(root.getRight().getData());
			leftStack.add(root.getRight());
		}
		
		int level = 0;
		
		while(!leftStack.isEmpty() || !rightStack.isEmpty()) {
			level++;
			if(level%2 == 1) {
				while(!leftStack.isEmpty()) {
					Node node = leftStack.pop();
					if(node.getRight() != null) {
						System.out.print(node.getRight().getData());
						rightStack.add(node.getRight());
					}
					if(node.getLeft() != null) {
						System.out.print(node.getLeft().getData());
						rightStack.add(node.getLeft());
					}
				}
			}
			else {
				while(!rightStack.isEmpty()) {
					Node node = rightStack.pop();
					if(node.getLeft() != null) {
						leftStack.add(node.getLeft());
						System.out.print(node.getLeft().getData());
					}
					if(node.getRight() != null) {
						leftStack.add(node.getRight());
						System.out.print(node.getRight().getData());
					}

				}
			}
		}
	}
	
	public static void printJumpingNumbersUtil(int startNum, int maxNum) {
		
		Queue <Integer> queue = new LinkedList<Integer>();
		queue.add(startNum);
		
		while(!queue.isEmpty()) {
			int elem = queue.remove();
			if(elem <= maxNum) {
				System.out.print(+elem + " ");

				int unitsDigitOfElem  = elem % 10;
				if(unitsDigitOfElem == 0) {
					int numToBeAdded = elem *10 + (unitsDigitOfElem + 1);
					queue.add(+numToBeAdded);
				}
				else if(unitsDigitOfElem == 9) {
					int numToBeAdded = elem *10 + (unitsDigitOfElem - 1);
					queue.add(+numToBeAdded);
				}
				else {
					int numToBeAdded = elem *10 + (unitsDigitOfElem - 1);
					queue.add(+numToBeAdded);
					numToBeAdded = elem *10 + (unitsDigitOfElem + 1);
					queue.add(numToBeAdded);
				}
			}
		}
	}
	
	/*Given a 2D grid of characters and a word, find all occurrences of given word in grid. A word can be matched in all 8 directions at any point. Word is said be found in a direction if all characters match in this direction (not in zig-zag form).

		The 8 directions are, Horizontally Left, Horizontally Right, Vertically Up and 4 Diagonal directions.
	 * 
	 */
	
	public enum Direction {
		LEFT,
		RIGHT,
		UP,
		DOWN,
		DIAGONALTOPLEFT,
		DIAGONALTOPRIGHT,
		DIAGONALBOTTOMLEFT,
		DIAGONALBOTTOMRIGHT
	}
	public static void findPatternUtil(char mat [][], String word, int x, int y) {
		boolean found = false;
		Direction[] directions = Direction.values();
		for(int i = 0; i < directions.length; ++i) {
			if(found) {
				break;
			}
			switch (directions[i]) {
			case LEFT:{

				int c = 1;
				while(c < word.length() && y >= word.length()-1){
					if(y-c >= 0 && mat[x][y-c] != word.charAt(c)) {
						break;
					}
					c++;
				}
				if(c == word.length()) {
					found = true;
					System.out.println("left Pattern found at (x,y)"+"("+x+","+y+")");
				}
				break;
			}
			case RIGHT:{

				int c = 1;
				while(c < word.length() && y <= mat[0].length - word.length()){
					if(y+c < mat[0].length && mat[x][y+c] != word.charAt(c)) {
						break;
					}
					c++;
				}
				if(c == word.length()) {
					found = true;
					System.out.println("right Pattern found at (x,y)"+"("+x+","+y+")");

				}
				break;
			}
			case UP:{

				int c = 1;
				while(c < word.length() && x >= word.length()-1){
					if(x-c >= 0 && mat[x-c][y] != word.charAt(c)) {
						break;
					}
					c++;
				}
				if(c == word.length()) {
					found = true;
					System.out.println("up Pattern found at (x,y)"+"("+x+","+y+")");

				}
				break;
			}
			case DOWN:{

				int c = 1;
				while(c < word.length()&& x <= mat.length - word.length()){
					if(x+c < mat.length && mat[x+c][y] != word.charAt(c)) {
						break;
					}
					c++;
				}
				if(c == word.length()) {
					found = true;
					System.out.println("down Pattern found at (x,y)"+"("+x+","+y+")");

				}
				break;
			}
			case DIAGONALTOPLEFT:{
				int c = 1;
				while(c < word.length() && x >= word.length() - 1 && y >= word.length()-1 ){
					if(x-c >=0 && y-c >= 0 && mat[x-c][y-c] != word.charAt(c)) {
						break;
					}
					c++;
				}
				if(c == word.length()) {
					found = true;
					System.out.println("diag top left Pattern found at (x,y)"+"("+x+","+y+")");

				}
				break;
			}
			case DIAGONALTOPRIGHT:{
				int c = 1;
				while(c < word.length()&& x >= word.length() - 1 && y <= mat[0].length - word.length()){
					if(x-c >=0 && y+c < mat[0].length && mat[x-c][y+c] != word.charAt(c)) {
						break;
					}
					c++;
				}
				if(c == word.length()) {
					found = true;
					System.out.println("diag top right Pattern found at (x,y)"+"("+x+","+y+")");

				}
				break;
			}
			case DIAGONALBOTTOMRIGHT:{
				int c = 1;
				while(c < word.length()&& x <= mat.length - word.length() && y <= mat[0].length - word.length()){
					if(x+c < mat.length && y+c < mat[0].length && mat[x+c][y+c] != word.charAt(c)) {
						break;
					}
					c++;
				}
				if(c == word.length()) {
					found = true;
					System.out.println("diag bottom right Pattern found at (x,y)"+"("+x+","+y+")");

				}
				break;
			}
			case DIAGONALBOTTOMLEFT:{
				int c = 1;
				while(c < word.length()&& x <= mat.length - word.length() && y >= word.length()-1){
					if(x+c <mat.length && y-c >= 0 && mat[x+c][y-c] != word.charAt(c)) {
						break;
					}
					c++;
				}
				if(c == word.length()) {
					found = true;
					System.out.println("diag bottom left Pattern found at (x,y)"+"("+x+","+y+")");

				}
				break;
			}
			default:
				break;
			}
		}
	}
	public static void findPattern(char mat [][], String word) {
		for(int i = 0; i < mat.length; ++i) {

			for(int j = 0; j < mat[0].length; ++j) {
				if(mat[i][j] == word.charAt(0)) {
					findPatternUtil(mat,word,i,j);
				}
			}
		}
		
	}
	
}


