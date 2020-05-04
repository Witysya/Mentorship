package FirstExcercises;

import java.util.function.DoubleToIntFunction;

public class StringMethods {
    public static void main(String[] args) {
        String myName = "Viktoriia-Anna";
        System.out.println(myName.length());
        System.out.println(myName.charAt(10));
        System.out.println(myName.indexOf("ri"));
        System.out.println(myName.substring(3,13));
        System.out.println(myName.substring(myName.indexOf("k")))  ;
        System.out.println(myName.toUpperCase());
        System.out.println(myName);

        System.out.println("VIKTORIIA".equals("Viktoriia"));

        System.out.println(myName.startsWith("V"));
        String nameWithSpaces = "Vika Anna    ";
        System.out.println(nameWithSpaces);
        System.out.println(nameWithSpaces.trim());
    }
}
