import java.util.Arrays;

public class StringUtils {

    public static String Reverso(String sU) {
        return new StringBuilder(sU).reverse().toString();
    }

    public static boolean Anagrama(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        return Arrays.equals(s1Array, s2Array);
    }

    public static void CopiaStrs(char[] s1, char[] s2) {
        for (int i = 0; i < s1.length; i++) {
            s2[i] = s1[i];
        }
    }

    public static String Concatenar(String s1, String s2) {
        return s1.concat(s2);
    }

    public static boolean Palindromo(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}
