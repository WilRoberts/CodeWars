// https://www.codewars.com/kata/517abf86da9663f1d2000003

import java.lang.StringBuilder;

class CamelCase {
	static String toCamelCase(String s){
		String[] words = s.split("-|_");
		for(int i = 1; i < words.length; i++){
			words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
		}
		return String.join("", words);
	}
}