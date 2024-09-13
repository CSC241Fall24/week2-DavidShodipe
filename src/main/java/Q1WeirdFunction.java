public class Q1WeirdFunction {

    
    public static int fRecursive(int n) {
        // Base cases
        if (n < 3) {
            return n;
        }
        return fRecursive(n - 1) + 2 * fRecursive(n - 2) + 3 * fRecursive(n - 3);
    }
    public static int fIterative(int n) {
        if (n < 3) {
            return n;
        }
        int f0 = 0; 
        int f1 = 1; 
        int f2 = 2;
        int fN = 0; 
        for (int i = 3; i <= n; i++) {
            fN = f2 + 2 * f1 + 3 * f0;
            f0 = f1;
            f1 = f2;
            f2 = fN;
        }

        return fN;
    }

    public static void main(String[] args) {
        System.out.println("Recursive f(5): " + fRecursive(5));
        System.out.println("Iterative f(5): " + fIterative(5));
    }
}
