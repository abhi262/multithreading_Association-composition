package String_java;

public class Launch {
    static String sum = "";

    public static void main(String[] args) {
        String s = "abcdzAXZ";
        System.out.println( s.isEmpty());
        String s1 = "";

        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            if (charAt >= 97 && charAt <= 122) { // Small letters (a-z)
                char m = (char) (charAt + 5);
                if (m > 'z') {
                    m = (char) (charAt - 26 + 5); // Wrap around from 'z' to 'a'
                }
                s1 = s1 + m;
            } else if (charAt >= 65 && charAt <= 90) { // Capital letters (A-Z)
                char m = (char) (charAt + 5);
                if (m > 'Z') {
                    m = (char) (charAt - 26 + 5); // Wrap around from 'Z' to 'A'
                }
                s1 = s1 + m;
            }
        }
        System.out.println(s1);
    }
}
