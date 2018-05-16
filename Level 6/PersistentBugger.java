// https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec

class PersistentBugger {
	public static int persistence(long n) {
  
	    if(n < 10) return 0;
	  
		long num = 1;
	    
	    for(long i = n; i != 0; i /= 10){
	  		num *= i % 10;
	    }
	  	return 1 + persistence(num);
	}
}