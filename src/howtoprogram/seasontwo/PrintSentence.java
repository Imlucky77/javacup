package howtoprogram.seasontwo;

import java.util.Scanner;

/**
 * @author imlucky
 */
public class PrintSentence {
    public static void main(String[] args) {

//        System.out.println("This is a Java program ");
//        System.out.printf("%s\n%s", "This is a java ", "program");

        //2.6
        /*Scanner input = new Scanner(System.in);
        int result;
        System.out.println("please enter first integer: ");
        int x = input.nextInt();
        System.out.println("please enter second integer: ");
        int y = input.nextInt();
        System.out.println("please enter third integer: ");
        int z = input.nextInt();

        result = x * y * z;
        System.out.printf("Product is %d%n ", result);*/


        /*System.out.println("1,2 " + " 3,4");
        System.out.printf("%d\t%d\t%d\t%d", 1, 2, 3, 4);*/

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first integer: ");
        int first = input.nextInt();
        System.out.println("Please enter second integer: ");
        int second = input.nextInt();

        int sum = first + second;
        System.out.println("sum is: " + sum);

        int product = first * second;
        System.out.println("sum is: " + product);

        int difference = first - second;
        System.out.println("sum is: " + difference);

        int division = first / second;
        System.out.println("sum is: " + division);
    }
}
