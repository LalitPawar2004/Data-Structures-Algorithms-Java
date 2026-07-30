// Q. Print a hollow butterfly pattern.
public class HollowButterfly {
    public static void main(String args[]) {
        int n = 5;

        // first
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // second
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                if (j == n || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }

            for (int j = n; j >= i; j--) {
                if (j == n || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
