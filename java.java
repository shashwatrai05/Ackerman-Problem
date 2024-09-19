public class java {
    public static int ack(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if ((m > 0) && (n == 0)) {
            return ack(m - 1, 1);
        } else if ((m > 0) && (n > 0)) {
            return ack(m - 1, ack(m, n - 1));
        }
        return 0; // This line is added to handle the case where none of the conditions are met.
    }

    public static void main(String[] args) {
        double A;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j < 15; j++) {
                A = ack(i, j);
                System.out.printf(" %d %d -> A= %f\n", i, j, A);
            }
        }
    }
}
