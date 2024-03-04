
//3.Write a java program to convert upper case to lower case and vice versa.
public class ToLowerCase {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter Upper case string..");
        String s = sc.nextLine();
        String s1 = s.toLowerCase();
        System.out.println("converted uppercase to lowercase :" + s1);

    }
}
