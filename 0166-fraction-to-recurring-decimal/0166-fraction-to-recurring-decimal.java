import java.util.*;

class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        // Edge case: numerator is 0
        if (numerator == 0) return "0";

        StringBuilder sb = new StringBuilder();

        // Handle sign
        // XOR: if exactly one is negative, result is negative
        if ((numerator < 0) ^ (denominator < 0)) {
            sb.append("-");
        }

        // Convert to long to avoid overflow (e.g., -2147483648)
        long n = Math.abs((long) numerator);
        long d = Math.abs((long) denominator);

        // Whole part
        long whole = n / d;
        sb.append(whole);

        long remainder = n % d;
        // No fractional part
        if (remainder == 0) return sb.toString();

        sb.append(".");

        // Map to remember where each remainder first appeared
        Map<Long, Integer> seen = new HashMap<>();

        // Build fractional part
        while (remainder != 0) {
            // If we’ve seen this remainder, we found a repeating cycle
            if (seen.containsKey(remainder)) {
                int repeatStart = seen.get(remainder);
                sb.insert(repeatStart, "(");
                sb.append(")");
                break;
            }

            // Remember the position where this remainder’s decimal digit will start
            seen.put(remainder, sb.length());

            remainder *= 10;
            long digit = remainder / d;
            sb.append(digit);
            remainder %= d;
        }

        return sb.toString();
    }
}
