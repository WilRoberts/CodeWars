// https://www.codewars.com/kata/55908aad6620c066bc00002a

public class ExesAndOhs {
	public static boolean getXO (String str) {
		str = str.toLowerCase();
		return str.replace("x","").length() == str.replace("o","").length();
	}
}