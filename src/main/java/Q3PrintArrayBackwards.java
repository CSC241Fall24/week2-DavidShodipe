public class Q3PrintArrayBackwards {
    private static int[] array = {1, 2, 3, 4, 5, 6, 7};

    public static void main(String[] args) {
        printRecursion(array.length - 1); // Start with the last index of the array
    }

    private static void printRecursion(int i) {
        if (i < 0) {
            return; // Base case: if the index is less than 0, stop recursion
        }
        System.out.println(array[i]); // Print the current element
        printRecursion(i - 1); // Recursive call to handle the previous element
    }
}
