import java.util.Scanner;

public class stringcreation {
    public static String coverttoupper(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String str = "abcde";
        String str2 = new String("xyz");
        // String name;
        Scanner sc = new Scanner(System.in);
        // name=sc.next();//doesnt take space as entry for that use nextline
        String fullname;
        fullname = sc.nextLine();
        // System.out.print(name);
        System.out.println(fullname);
        System.out.println(fullname.length());// here .length() is used instead of .length
        // concatanation
        String myfirstname = "anand";
        String mylastname = "sahoo";
        String myfullname = myfirstname + " " + mylastname;
        System.out.println(myfullname);
        for (int i = 0; i < fullname.length(); i++) {
            System.out.print(fullname.charAt(i) + " ");
        }
        System.out.print("\n");

        // if you want to check if the values of two strings are equal or not u should
        // always use '.equal()'funtion instead of ==

        String xyz = "anand";
        if (xyz.equals(myfirstname)) {
            System.out.print("strings are equal \n");
        }

        System.out.println(xyz.equals(mylastname));

        // if you want to print a substring of a string

        System.out.println(xyz.substring(0, 3));

        // if you want to compare lixinographically which string is bigger like in anand
        // and swaroop swaroop is bigger as 's' as bigger than 'a'

        String name[] = { "anand", "swaroop", "sahoo" }; // str1.compareTo(str2)
        String largest = name[0]; // 0 : equal
        for (int i = 1; i < name.length; i++) { // < 0 : -ve str1<str2
            if (largest.compareTo(name[i]) < 0) { // > 0 : +ve str1>str2
                largest = name[i];
            }

        }
        System.out.println(largest);

        //using STRING BUILDER
        // StringBuilder ss = new StringBuilder("");
        // for (char c = 'a'; c < 'z'; c++) {
        //     ss.append(c);

        //     System.out.print(ss);
        // }

        // to convert any lower case character in a string to uppercase character we use
        // "_.touppercase(ch)" inbuilt function

        // wap to covert for a given string convert each the first letter of each word
        // to uppercase.

        String anand = "hi i am anand swaroop sahoo";
        System.out.println(coverttoupper(anand));  //comment all the above to see this running.funtion upar likha hai


        sc.close();

        //how to convert string into character array directly

        String stranand="anand";
        char[] strcharArray=stranand.toCharArray();
        for (int i = 0; i < strcharArray.length; i++) {
            System.out.print(strcharArray[i]+", ");
        }
    

        // strings are immutable in nature

    }

}
