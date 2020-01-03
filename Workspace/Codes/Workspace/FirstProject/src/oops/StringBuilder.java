package oops;

import java.util.StringTokenizer;

public class StringBuilder {
public static void main(String[] args) {
	String text="The quick fox jumps over the lazy dog";
	StringTokenizer token=new StringTokenizer(text);
	System.out.println(token.countTokens());
	
	while(token.hasMoreElements()) {
		System.out.println(token.nextToken());
	}
}
}
