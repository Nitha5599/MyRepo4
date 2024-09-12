package stringExamplePalindrome;

public class Palindrome {

	public static void checkPalindrome(String str) {
        String original = str.toLowerCase();
        String rev = "";

        for (int i = original.length()- 1; i>= 0; i--) {
            rev += original.charAt(i);
        }

        if (original.equals(rev)) {
            System.out.println(str + " is a Palindrome.");
        } else {
            System.out.println(str + " is not a Palindrome.");
        }
    }
	public static void main(String[] args) {
		checkPalindrome("Java");
		checkPalindrome("Malayalam");
	}

}
