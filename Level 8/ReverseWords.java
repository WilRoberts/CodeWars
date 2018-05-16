// https://www.codewars.com/kata/51c8991dee245d7ddf00000e

public class ReverseWords{
	public static String reverseWords(String str){
		String words[] = str.split(" ");
		String reverse = "";

		for(int i = words.length-1; i >= 0; i--){
			reverse += words[i] + " ";
		}
		return reverse.trim();
	}
}