public class Q1WeirdFunction {

    // Recursive implementation of the function f(n)
    public static int fRecursive(int n) {
        // Base cases
        if (n < 3) {
            return n;
        }
        // Recursive case
        return fRecursive(n - 1) + 2 * fRecursive(n - 2) + 3 * fRecursive(n - 3);
    }

    // Iterative implementation of the function f(n) using basic Java skills
    public static int fIterative(int n) {
        // Handle base cases directly
        if (n < 3) {
            return n;
        }

        // Variables to store the results of f(n-1), f(n-2), and f(n-3)
        int f0 = 0; // f(0)
        int f1 = 1; // f(1)
        int f2 = 2; // f(2)
        int fN = 0; // This will store f(n)

        // Compute f(n) iteratively
        for (int i = 3; i <= n; i++) {
            // Calculate the current value using the recurrence relation
            fN = f2 + 2 * f1 + 3 * f0;

            // Update f0, f1, and f2 for the next iteration
            f0 = f1;
            f1 = f2;
            f2 = fN;
        }

        return fN;
    }

    public static void main(String[] args) {
        // Test the functions
        System.out.println("Recursive f(5): " + fRecursive(5));
        System.out.println("Iterative f(5): " + fIterative(5));
    }
}
