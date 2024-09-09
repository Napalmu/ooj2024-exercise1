package fi.utu.tech.ooj.exercise1.teht4;

public class Factorial {

    public static int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        } else if (n == 0) {
            return 0;
        } else {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}
