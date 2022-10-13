import java.util.*;

public class checkanagrams {
    // two stings are called anagrams if they have same length and have all the same
    // letters but only jumbled in differnt order
    // for example care and race
    public static boolean isanangram(String str1, String str2) {
        if (str1.length() == str2.length()) {
            // convert strings to lowercase so that we don't have to check separetly for
            // lower & uppercase.
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            // convert strings into char array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            // sort the char attay
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            // checking if the arrays are identical or not
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if (result) {
                return true;

            } else {
                return false;
            }

            

        }
    return false;
    }

    public static void main(String args[]) {
        String str1 = "care";
        String str2 = "race";
        System.out.println(isanangram(str1, str2));

    }

}
