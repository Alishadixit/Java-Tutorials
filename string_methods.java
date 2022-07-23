import java.util.Locale;

public class string_methods {
    public static void main(String[] args) {
        String name="Alisha";
        System.out.println(name);
        int value=name.length();
//        this returns length of string
        System.out.println(value);
//        this convert above string to lower case characters
        System.out.println(name.toLowerCase(Locale.ROOT));
//        same as above vice versa to upper case
        System.out.println(name.toUpperCase(Locale.ROOT));
        String nontrimmedstring="      DIXIT   ";
//        this trim function removes all the spaces from the above string
        System.out.println(nontrimmedstring.trim());
//        this substring is use to print char from given index
        System.out.println(name.substring(1));
//        this print char from start index to end index excluding last char.
        System.out.println(name.substring(2,4));
//        this is use to replace character
        System.out.println(name.replace("A","D"));
//        this is use to replace set of characters
        System.out.println(name.replace("Al","Del"));
//        this is use to print boolean values
        System.out.println(name.startsWith("A"));
        System.out.println(name.endsWith("y"));
    }
}
