package eif203.labs.permutate;
import java.util.*;
import java.util.function.*;
import eif203.util.*;
import eif203.labs.permutate.util.*;

/**
 loriacarlos@gmail.com
*/
public class Permutate  {
	Helper helper;
	public Permutate(Helper helper){
		this.helper = helper;
	}
	public void next_lexicographic_permutation(String[] a){
		int i, k;
		// Find a peak;
		for( i = a.length - 2; i > 0 && a[i].compareTo(a[i + 1]) > 0; i-- );
		if (i < 0){
			return;
		}
		// i >= 0 && a[i] < a[i + 1] > a[i + 2] > ... > a[a.length - 1]
		// Find the least k st. a[k] > a[i]
		for (k = a.length - 1; k >= 0 && a[i].compareTo(a[k]) > 0; k--);
		helper.swap(a, i, k);
		// reverse from i+1 .. a.length - 1
		for(int l = i + 1, r = a.length - 1;  l <= r; l++, r--){
			helper.swap(a, l, r);
		}
    }
    public void  permutate_lexicographically(String[] a, Function<String[], Void> doit){
		for (int i = 0; i < helper.fact(a.length); i++){
			helper.printMargin("Round i=" + i + " " + Arrays.toString(a));
			doit.apply(a);
			next_lexicographic_permutation(a);
			
		}
		
	}
}