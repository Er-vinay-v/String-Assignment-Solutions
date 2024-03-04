//4.Write a java program to remove a particular character from a String.

import static java.lang.System.*;

public class RemoveChar {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        out.println("Enter a String");
        StringBuilder str = new StringBuilder(sc.nextLine());
        out.println("Enter deleting character of given string");
        char c = sc.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == c) {
                str.deleteCharAt(i);
                break;
            }
        }
        out.println(str);
    }
}
