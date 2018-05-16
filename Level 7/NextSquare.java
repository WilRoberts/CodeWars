// https://www.codewars.com/kata/56269eb78ad2e4ced1000013

public class NextSquare {
  public static long findNextSquare(long sq) {
      long root = Math.round(Math.sqrt(sq));
      return (root * root) == sq ? (root + 1) * (root + 1) : -1; 
  }
}