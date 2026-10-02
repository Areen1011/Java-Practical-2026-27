public class Q5Pattern {

    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {

            // Spaces
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print("  ");
            }

            // Decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}