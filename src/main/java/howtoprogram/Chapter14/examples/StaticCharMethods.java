package howtoprogram.Chapter14.examples;

import java.util.Scanner;

/**
 * @author imlucky
 * @Created: 2019/03/12
 * @Examples: Fig. 14.15: StaticCharMethods.java
 */
public class StaticCharMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a character and press Enter: ");
        String string = input.next();
        char c = string.charAt(0);

        System.out.printf("is defined %b%n", Character.isDefined(c));
        System.out.printf("is digit %b%n", Character.isDigit(c));
        System.out.printf("is first character in a Java identifier: %b%n", Character.isJavaIdentifierStart(c));
        System.out.printf("is part of a Java identifier: %b%n", Character.isJavaIdentifierPart(c));
        System.out.printf("is letter: %b%n", Character.isLetter(c));
        System.out.printf("is letter or digit: %b%n", Character.isLetterOrDigit(c));
        System.out.printf("is upper case: %b%n", Character.isUpperCase(c));
        System.out.printf("is lower case: %b%n", Character.isLowerCase(c));
        System.out.printf("is upper case: %s%n", Character.toUpperCase(c));
        System.out.printf("is upper case: %s%n", Character.toLowerCase(c));
    }
}
