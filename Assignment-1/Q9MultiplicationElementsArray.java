import java.util.Scanner;

public class Q9MultiplicationElementsArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int product = 1;

        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }

        System.out.println("The product of all elements in the array is: " + product);

        sc.close();
    }
    
}
