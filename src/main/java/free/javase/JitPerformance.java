package free.javase;

public class JitPerformance {
    /*public static void main(String[] args) {
        for (int outer = 1; outer <= 100; outer++) {
            long start = System.nanoTime();
            testPerformance();
            long duration = System.nanoTime() - start;
            System.out.println("Loop # " + outer + " took " + ((duration) / 1000.0d) + " µs");
        }
    }

    private static void testPerformance() {
        long sum = 0;
        for (int i = 1; i <= 5000; i++) {
            sum = sum + random(i);
        }
    }

    private static int random(int i) {
        int x = (int) (i * 2.3d / 2.7d); // This is a simulation
        int y = (int) (i * 2.36d);     // of time-consuming
        return x % y;                 // business logic.
    }*/

    /*public static void main(String[] args) {
        for (int outer=1;outer<=100;outer++)
        {
            long start = System.nanoTime();
            long sum = 0;
            for (int i = 1; i <= 5000; i++)
            {
                int x = (int)(i*2.3d/2.7d); // This is a simulation
                int y = (int)(i*2.36d);     // of time-consuming
                sum = sum + x%y;            // business logic.
            }
            long duration = System.nanoTime()-start;
            System.out.println("Loop # " + outer + " took " + ((duration)/1000.0d) + " µs");
        }
    }*/

    public static void main(String[] args) {
        for (int outer = 1; outer <= 100; outer++) {
            long start = System.nanoTime();
            long sum = 10647704;
            long duration = System.nanoTime() - start;
            System.out.println("Loop # " + outer + " took "    + ((duration) / 1000.0d) + " µs");
        }
    }
}

