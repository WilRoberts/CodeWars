// https://www.codewars.com/kata/551dc350bf4e526099000ae5

public class Dubstep {
	public static String SongDecoder (String song){
		return String.join(" ", song.split("(WUB)+")).trim();
	}
}