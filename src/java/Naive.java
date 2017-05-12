package eif203.labs.permutate;
import java.util.*;
import java.util.function.*;
import eif203.util.*;
import eif203.labs.permutate.util.*;
import java.lang.Object.*;
 
 public class Naive{

	/*public void permutate_naively(String[] p){
	if (p.length == 0) return [[]]; if (p.length == 1) return [p];
	String first = p[0];
	String[] withoutFirst = permutate_naively(Arrays.copyOfRange(p, 1));
	return insertFirstIntoAll(first, withoutFirst);
	


	public String[] insertFirstIntoAll(first, withoutFirst){
	String[] res = new String[allWithFirst.length] ;
	for(int i = 0; i < withoutFirst.length; i++){
		String[] allWithFirst = insertFirstIntoOne(first, withoutFirst[i]);
		res = ArrayUtils.add(allWithFirst);
	}
	return res;
	
}

	public String[] insertFirstIntoOne(first, p){ // p = [p[0], p[1], ..., p[n]]
	String res = new ArrayList();
	for(int i = 0; i <= p.length; i++){
		String s = insertAt(p, i, first)
		res.add(s);
	}
	
	return res;
}
*/

	 
 }