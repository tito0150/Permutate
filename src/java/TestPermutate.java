package eif203.labs.permutate;
import java.util.*;
import eif203.util.*;
import eif203.labs.permutate.util.*;

/**
 loriacarlos@gmail.com
*/
public class TestPermutate extends Helper {
	Permutate perm = new Permutate(this);
	
	public void test_permutate_lexicographically(int n){
		print("\n*** Testing lexicographically ***");
		reset();
		String[] a = genArray(n);
		method = LEXIC;
		permTester = new PermTester(method, n);
		long before = cTM();
		this.perm.permutate_lexicographically(a, (String[] p) -> {this.showPermutation(p); return null;});
		long  after = cTM();
		print("\n*** Count of lexicographically swaps = " + swaps + " (" + (after - before) + " ms)");
		permTester.ensureComplete();
	}
	public void test_recursive_backtracking(int n){
		// To do
		print("\n *** test_recursive_backtracking NOT IMPLEMENTED!! ***");
	}
	public void test_recursive_heap_sedgewick(int n){
		print("\n *** test_recursive_heap_sedgewick NOT IMPLEMENTED!! ***");
	}
	public void test_permutate_naive(int n){
		print("\n ***test_permutate_naive NOT IMPLEMENTED!! ***");
	}
	
}