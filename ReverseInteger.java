/**
 * Reverse digits of an integer.
 *
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 *
 */
 
public class ReverseInteger {
    public long reverse(int x) {
        boolean isNegative = x < 0;
        if (x < 0) {
            x = -x;
        }
        
        long result = 0;
        while (x != 0) {
            result = result * 10 + (x % 10);
            x /= 10;
        }
        
        return isNegative ? -result : result;
    }
}
