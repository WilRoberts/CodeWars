// https://www.codewars.com/kata/54c27a33fb7da0db0100040e

public class Square {    
	public static boolean isSquare(int n) {  
	    long root = Math.round(Math.sqrt(n));
	    return root * root == n;
	}
}