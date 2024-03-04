
//5.Write a java program to find the index of a substring.
public class SubString {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a  String");
        String s = sc.nextLine();
        System.out.println("Enter subString you want to find index");
        System.out.println("First index of this subString is :"+s.indexOf(sc.nextLine()));

    }
}
