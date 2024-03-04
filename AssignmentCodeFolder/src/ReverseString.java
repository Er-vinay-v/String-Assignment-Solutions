public class ReverseString {
    //1.Write a java program to Reverse a string without using the inbuilt method.
    public static void main(String[] args) {

        String s = "VinayVerma";
        int n = s.length();
        String reverse = "";
        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            reverse += ch;
        }
        System.out.println(reverse);
    }
}

//output :- amreVyaniV