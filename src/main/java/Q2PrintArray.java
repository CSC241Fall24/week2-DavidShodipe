public class Q2PrintArray {
    private static int[] array = {1, 2, 3, 4, 5, 6, 7};

    public static void main(String[] args) {
        printRecursion(0);  // Start recursion from index 0
    }

    private static void printRecursion(int i) {
        if (i >= array.length) {
            return;  // Base case: Stop when i is beyond the last index
        }

        // Recursive call to print the next element
        printRecursion(i + 1);

        // Print the element after the recursive call
        System.out.println(array[i]);
    }
}




