package eif203.labs.permutate;
import java.util.*;
import java.util.function.*;
import eif203.util.*;
import eif203.labs.permutate.util.*;
import java.lang.Object.*;
 
 public class Naive{
	Helper helper;
	public Naive(Helper helper){
		this.helper = helper;
	}

	public Naive(){
	}

	public String[][] permutate_naively(String[] p){
		if (p.length == 0) 
			return null; 
		if (p.length == 1) {
			String[][] s = new String[][] {p};
			return s;
		}
		String first = p[0];
		String[][] withoutFirst = permutate_naively(Arrays.copyOfRange(p, 1, p.length));
		return insertFirstIntoAll(first, withoutFirst);
	}


	public String[][] insertFirstIntoAll(String first, String[][] withoutFirst){
		ArrayList<String[]> res = new ArrayList<String[]>();
		for(int i = 0; i < withoutFirst.length; i++){
			ArrayList<String[]> allWithFirst = insertFirstIntoOne(first, withoutFirst[i]);
			res.addAll(allWithFirst);
		}
		String[][] resFinal = new String[res.size()][];
		resFinal = res.toArray(resFinal);
		return resFinal;
	}
	

	public ArrayList<String[]> insertFirstIntoOne(String first, String[] p){
		ArrayList<String[]> res = new ArrayList<String[]>();
		for(int i = 0; i <= p.length; i++){
			String[] s = insertAt(p, i, first); //esto retorna un string[], por lo tanto si lo añadimos a otro vector ocupamos string[][];
			res.add(s);
		}
		return res;
	}
 }
