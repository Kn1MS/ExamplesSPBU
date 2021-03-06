package net.punklan.glorfindeil.study.lesson2;

import java.io.UnsupportedEncodingException;

/**
 * Created by Aleksandr_Kichev on 28-Feb-17.
 */
public class StringExamples {
    public static void main(String[] args) {
        //Initialization with literal
        String str1 = "Hello World";
        System.out.println("str1:" + str1);
        //Equals
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        System.out.println(s1 + "==" + s2 +
                " : " + (s1 == s2)); // true
        System.out.println(s1 + "==" + s3 +
                " : " + (s1 == s3)); // false
        System.out.println(s1 + " equals " + s2 + " : "
                + s1.equals(s2)); // true
        System.out.println(s1 + " equals " + s3 + " : "
                + s1.equals(s3)); // true
        //Initialization with char array
        char arr[] = {'H', 'e', 'l', 'l', 'o'};
        String str2 = new String(arr);
        System.out.println("str2:" + str2);

        //Concatenation using + operator
        String str3 = "World";
        str3 = str2 + " " + str3;
        System.out.println("str3:" + str3);

        //find out the length of a string
        System.out.println(str3.length());

        //You can even apply that to literals, as with all String API methods
        //As we said. literals are implemented as String instances
        System.out.println("Length: " + "abcdefg".length());

        //Substring from position 2 to position 10
        String c = str1.substring(2, 10);
        System.out.println("Substring :" + c);

        //Substring from position 1 to position 4
        System.out.println("Literal Substring :" + "abcdefghigklm".substring(1, 4));

        // Get the charcter array of the string.
        char[] chars = c.toCharArray();
        System.out.println("Char array : [" + chars[0] + "," + chars[1] + "," + chars[2] + "]");

        //find the first index of a char inside a string
        int i = str1.indexOf('W');
        System.out.println("Index of 'W':" + i);

        //find the first index of a string inside another string after a certain position
        i = str1.indexOf("orld", 5);
        System.out.println("Index of 'orld':" + i);

        //find the last index of a string inside another string
        i = str1.lastIndexOf("l");
        System.out.println("LAST Index of 'l':" + i);

        //find the last index of a string inside another string after a certain position
        // - like scanning the string backwards
        i = str1.lastIndexOf("l", 7);
        System.out.println("LAST Index of 'l':" + i);

        //find a character in a certain position
        char cr = str1.charAt(5);
        System.out.println("Character at position 5:" + cr);

        //Lower case
        System.out.println("ABCEFAFA".toLowerCase());

        //Upper case
        System.out.println("abcasipasc".toUpperCase());

        //replace occurrences of a character
        str1 = str1.replace('o', '0');
        System.out.println(str1);

        //Trim white spaces from the end and the beginning
        String str4 = "    Java";
        System.out.println(str4);
        System.out.println(str4.trim());

        //Split !!!
        String str5 = "Java is great";
        String[] strArray = str5.split(" ");

        System.out.println(strArray[0] + "," + strArray[1] + "," + strArray[2]);

        str5 = "Java-is-great";
        strArray = str5.split("-");
        System.out.println(strArray[0] + "," + strArray[1] + "," + strArray[2]);

        str5 = "Java is great";
        strArray = str5.split("/*");
        System.out.println(strArray[0] + "," + strArray[1] + "," + strArray[2] + "," + strArray[3] + "," + strArray[4] +
                "," + strArray[5] + "," + strArray[6] + "," + strArray[7] + "," + strArray[8]);

        //contains and equals
        System.out.println("Contains :" + "qwerty".contains("ert"));
        System.out.println("Equals :" + str5.equals("java is great"));
        System.out.println("Equals ignore case:" + str5.equalsIgnoreCase("java is great"));

        // Compare lexicographically two strings
        System.out.println("Compare:" + str5.compareTo("abc"));

        //comparison attempts
        String st1 = "abc";
        String st3 = new String("abc");

        System.out.println(st1 == st3);
        System.out.println(st1.equalsIgnoreCase(st3));

        long time = System.currentTimeMillis();
        String concatSlow = "";
        for (i = 0; i < 10000; i++) {
            concatSlow = concatSlow + i;
        }
        System.out.println("Slow concat for " + (System.currentTimeMillis() - time));

        System.out.println("concatSlow = " + concatSlow);
        time = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (i = 0; i < 10000; i++) {
            builder.append(i);
        }
        System.out.println("builder.toString() = " + builder.toString());
        System.out.println("Fast concat for " + (System.currentTimeMillis() - time));

        try {
            String cp1251InUtf = new String("РџСЂРёРІРµС‚ РјРёСЂ");
            byte[] bytes = cp1251InUtf.getBytes("CP1251");

            String encoded = new String(bytes, "UTF8");
            System.out.println(encoded);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
