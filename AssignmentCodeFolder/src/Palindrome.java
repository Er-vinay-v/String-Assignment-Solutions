//2.Write a java program to know whether the given string is palindrome
public class Palindrome {

    static boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        String s1 = str.toString();
        return s.equals(s1);

    }

    public static void main(String[] args) {

        String s = "ABA";
        boolean ans = isPalindrome(s);
        if (ans == true) System.out.println(s + " : Yes this String is palindrome.");
        else System.out.println(s + " : Not a palindrome .");
    }
}
