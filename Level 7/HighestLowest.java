// https://www.codewars.com/kata/554b4ac871d6813a03000035

public class HighestLowest {
    public static String HighAndLow(String numbers) {
        String nums[] = numbers.split(" ");
        
        int low = Integer.parseInt(nums[0]);
        int high = Integer.parseInt(nums[0]);
        
        int nextNum;
        for(int i = 1; i < nums.length; i++){
            nextNum = Integer.parseInt(nums[i]);
            low = low <= nextNum ? low : nextNum;
            high = high >= nextNum ? high : nextNum;
        }
        return high + " " + low;
    }
} 