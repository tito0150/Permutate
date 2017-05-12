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
		print("\n *** Testing recursive_backtracking ***"); 
		reset();
		String[] a = genArray(n);
		method = BACKTRACKING;
		permTester = new PermTester(method, n);
		long before = cTM();
		this.perm.recursive_backtracking(a, a.length -1 , (String[] p) -> {this.showPermutation(p); return null;});
		long  after = cTM();
		print("\n*** Count of recursive_backtracking swaps = " + swaps + " (" + (after - before) + " ms)");
		permTester.ensureComplete();
		
			

	}
	
	public void test_recursive_heap_sedgewick(int n){
		print("\n *** Testing recursive_heap_sedgewick ***");
		reset();
		String[] a = genArray(n);
		method = HEAP_SEDGEWICK;
		permTester = new PermTester(method, n);
		long before = cTM();
		this.perm.recursive_heap_sedgewick(a, a.length -1 , (String[] p) -> {this.showPermutation(p); return null;});
		long  after = cTM();
		print("\n*** Count of recursive_heap_sedgewick swaps = " + swaps + " (" + (after - before) + " ms)");
		permTester.ensureComplete();
			
		
	}
	public void test_permutate_naive(int n){
		print("\n ***test_permutate_naive NOT IMPLEMENTED!! ***");
	}
	
}