package eif203.labs.permutate.util;
import java.util.*;
import eif203.util.*;

/**
 loriacarlos@gmail.com
*/
public class Printing {
	int margin = 0;
    int increment = 3;
    String marginChar = " ";
	boolean verbose = true;
	
	public void print(String s){
		System.out.println(s);
	}
	public void write(String s){
		System.out.print(s);
	}
	public void resetMargin(){
		margin = 0;
		increment = 3;
		marginChar = " ";
	}
	public void incMargin(){
		margin += increment;
	}

	public void decMargin(){
		margin -= increment;
	}
	public void printMargin(String s){
		if (! verbose ) return;
		for (int i = 1; i <= margin; i++) 
			write(marginChar);
		print(s);
	}

	public void printPlain(String s){
		if (! verbose ) return;
		print(s);
	}
}