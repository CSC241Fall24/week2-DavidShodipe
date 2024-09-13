public class Q4ReverseString {
    public static void main(String[] args) {
        String original = "test string";
        String reversed = reverse(original);
        System.out.println("Reversed string: " + reversed);
    }
    public static String reverse(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
