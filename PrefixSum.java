package prefixSum;

import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();
        System.out.println("Enter array elements");
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        for (int j = 1; j < size; j++) {

            array[j] += array[j - 1];
        }

        for (int a = 0; a < size; a++) {
            System.out.println(array[a]);
        }
    }
}
