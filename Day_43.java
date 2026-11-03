/** Concept: Array Manipulation
Move all zeros to the end of the array while maintaining the order of the non-zero elements. **/ 

import java.util.*;

class MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                a[index] = a[i];
                index++;
            }
        }
        while (index < n) {
            a[index] = 0;
            index++;
        }

        System.out.println("Array after moving zeros:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
