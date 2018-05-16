// https://www.codewars.com/kata/541c8630095125aba6000c00

public class DigitRoot {
	public static int digital_root(int n) {

		if(n < 10) return n;

		int num = 0;
		for(int i = n; i != 0; i /= 10){
	  		num += i % 10;
		}
		return digital_root(num);
	}
}