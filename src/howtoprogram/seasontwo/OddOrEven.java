package howtoprogram.seasontwo;

import java.util.Scanner;

/**
 * @author imlucky
 * 2.25
 */
public class OddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }
}
