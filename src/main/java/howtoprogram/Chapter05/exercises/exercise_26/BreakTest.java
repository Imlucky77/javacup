package howtoprogram.Chapter05.exercises.exercise_26;

/**
 * @author imlucky
 * @Created: 2019/02/16
 * @Exercise: 5.26
 */
public class BreakTest {
    public static void main(String[] args) {
        int count;
        for (count = 1; count <= 10; count++) {
            if (count == 5) {
                break;
            }
            System.out.printf("%d ", count);
        }
        System.out.printf("%nBroke output of loop at count = %d%n", count);
    }
}
