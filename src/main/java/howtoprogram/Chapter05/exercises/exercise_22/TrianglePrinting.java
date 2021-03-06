package howtoprogram.Chapter05.exercises.exercise_22;

/**
 * @author imlucky
 * @Created: 2019/02/14
 * @Exercise: 5.22
 */
public class TrianglePrinting {
    public static void main(String[] args) {

        // Pattern A
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        // Pattern B
        for (int i = 10; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        for (int i = 10; i >= 0; i--) {
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(' ');
            }
            for (int k = 0; k < i; k++) {
                System.out.print('*');
            }
            System.out.println();
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 10 - i; j > 0; j--) {
                System.out.print(' ');
            }
            for (int k = 0; k < i; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
