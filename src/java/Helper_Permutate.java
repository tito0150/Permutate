package eif203.labs.permutate;
import java.util.*;

public static class Helper_Permutate{
// Helper variables and helper functions
int swaps = 0;            // counts swaps
int permutation = 0;      // counts permutations
int insertions = 0;       // counts insertions
//int permTester;           // verifies correctness
String method = "";          // indicates the algroithms currently used

// if not indicated algorithms uses this number for generation
int DEFAULT_PERMUT_SIZE = 3;

// Algorithm names (method)
String BACKTRACKING   = 'backtrack';
String HEAP_SEDGEWICK = 'heap_sedgewick';
String LEXIC          = 'lexicographic';
String NAIVE          = 'naive';

// Array of letters used to permutate (max = 20)
char[] baseArray = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
                 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
				 'Q', 'R', 'S', 'T'
                ];
/*
 Simple exchange function with counter (reset every time a function is tested)
*/
public static void swap(char[] a, int i, int j){
	if ( i == j) 
		return;
	swaps += 4;
	char t = a[i];
	a[i] = a[j];
	a[j] = t;
}
/*
  inserts x a every position i in p with counting
*/
public static void  insertAt(String[] p, int i, String x){
	
	String res = [];
	for(int k = 0; k < i; k++){
		insertions++;
		res.push(p[k]);
	}
	insertions++;
	res.push(x);
	for(int k = i; k < p.length; k++){
		insertions++;
		res.push(p[k]);//preguntar
	}
	return res;
}

public static void fact(n){
	int f = 1;
	for (int i = 1; i <=n; f *= i, i++);
	return f;
}

public static char genArray(n){
	n = n || DEFAULT_PERMUT_SIZE;
	n = n % baseArray.length;
	return baseArray.slice(0, n);
}


public static void showPermutation(a){
	if (permTester)
	   permTester.add(new Permutation(method, a));
	printPlain(format("%3.0f) %s", ++permutation, a.toString()));
}


function reset(method, n){
	resetMargin();
	permutation = 0;
	swaps = 0;
	insertions = 0;
	method = "";
	permTester = null;
	
}	
	
	

}