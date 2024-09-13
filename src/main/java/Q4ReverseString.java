public class Q4ReverseString {

    public static String reverse(String s) {
        if (s == null || s.length() <= 1) {
            return s; // Base case: if the string is null or has 0 or 1 character, return it as is
        }
        return reverse(s.substring(1)) + s.charAt(0); // Recursive case: reverse the substring and append the first character
    }

    public static void main(String[] args) {
        String original = "hello";
        String reversed = reverse(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}

