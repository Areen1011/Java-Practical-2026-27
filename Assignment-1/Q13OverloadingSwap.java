public class Q13OverloadingSwap {
    void swap(int a, int b) {
        System.out.println("Before swapping: " + a + " " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: " + a + " " + b);
    }

    void swap(float a, float b) {
        System.out.println("Before swapping: " + a + " " + b);
        float temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: " + a + " " + b);
    }

    void swap(char a, char b) {
        System.out.println("Before swapping: " + a + " " + b);
        char temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: " + a + " " + b);
    }

    public static void main(String[] args) {
        Q13OverloadingSwap s = new Q13OverloadingSwap();

        s.swap(10, 20);
        s.swap(2.5f, 5.5f);
        s.swap('A', 'B');
    }
}
