package eif203.labs.permutate;
import java.util.*;
import eif203.util.*;
import eif203.labs.permutate.util.*;

/**
 loriacarlos@gmail.com
*/
public class Helper  extends Printing {
	public long cTM(){ 
	  return System.currentTimeMillis();
	}
	// Helper variables and helper functions
	int swaps = 0;            // counts swaps
	int permutation = 0;      // counts permutations
	int insertions = 0;       // counts insertions
	PermTester permTester;           // verifies correctness
	String  method = "";          // indicates the algroithms currently used

	// if not indicated algorithms uses this number for generation
	public static int DEFAULT_PERMUT_SIZE = 3;

	// Algorithm names (method)
	String BACKTRACKING   = "backtrack";
	String HEAP_SEDGEWICK = "heap_sedgewick";
	String LEXIC          = "lexicographic";
	String NAIVE          = "naive";

	// Array of letters used to permutate (max = 20)
	String[] baseArray = {"A", "B", "C", "D", "E", "F", "G", "H",
                          "I", "J", "K", "L", "M", "N", "O", "P",
				          "Q", "R", "S", "T"
	};
	
	public Helper(){
		
	}
	public void swap(String[] a, int i, int j){
		if ( i == j) 
			return;
		swaps += 4;
		String t = a[i];
		a[i] = a[j];
		a[j] = t;
   }
   /*
  inserts x a every position i in p with counting
   */
	public String[] insertAt(String[] p, int i, String x){
		
		String[] res = new String[p.length + 1] ;
		int k = 0;
		for(; k < i; k++){
			insertions++;
			res[k] = p[k];
		}
		insertions++;
		res[k] = x;
		for(k = i; k < p.length; k++){
			insertions++;
			res[k] = p[k];
		}
		return res;
	}

	public long fact( int n){
		long f = 1;
		for (int i = 1; i <= n; f *= i, i++);
		return f;
	}
    public String[] genArray(){
		return genArray(DEFAULT_PERMUT_SIZE);
	}
	public String[] genArray(int n){
		n = n % baseArray.length;
		return Arrays.copyOfRange(baseArray, 0, n);
	}


	public void showPermutation(String[] a){
		if (permTester != null)
		   permTester.add(new Permutation(method, a));
		printPlain(String.format("%3d) %s", ++permutation, Arrays.toString(a)));
	}


	public void reset(){
		resetMargin();
		permutation = 0;
		swaps = 0;
		insertions = 0;
		method = "";
		permTester = null;
		
	}
}