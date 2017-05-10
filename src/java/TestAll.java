package eif203.labs.permutate;
import java.util.*;
import eif203.util.*;
import eif203.labs.permutate.util.*;

/**
 loriacarlos@gmail.com
*/
public class TestAll {
   public static void test_permutate_all(int n){
	   TestPermutate testPerm = new TestPermutate();
	   testPerm.test_recursive_backtracking(n);
	   testPerm.test_recursive_heap_sedgewick(n);
	   testPerm.test_permutate_lexicographically(n);
	   testPerm.test_permutate_naive(n);
   } 
   public static void main(String[] args) throws Exception {
	   int n = Helper.DEFAULT_PERMUT_SIZE;
	   if (args.length != 0) {
		   n = Integer.parseInt(args[0]);
	   }
	  
       System.out.println("\n*** Testing all permutation methods with " + n + " objects ***\n");
       
	   test_permutate_all(n);

       System.out.println("\n *** Finished ***");
   }
}