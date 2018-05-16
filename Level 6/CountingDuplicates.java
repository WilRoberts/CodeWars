// https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        if(text.length() <= 1) return 0;

        text = text.toLowerCase();

        for(int i = 1; i < text.length(); i++){
            if(text.charAt(0) == text.charAt(i)){
                return 1 + duplicateCount(text.replace(text.substring(0,1), ""));
            }
        }
        return duplicateCount(text.substring(1,text.length()));
    }
}