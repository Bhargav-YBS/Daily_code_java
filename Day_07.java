import java.util.*;

public class TwoSumSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter " + n + " elements (sorted ascending):");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        int[] result = twoSum(numbers, target);

        if (result[0] == -1) {
            System.out.println("No two numbers add up to " + target);
        } else {
            System.out.println("Indices (1-based): [" + result[0] + ", " + result[1] + "]");
            System.out.println("Values: " + numbers[result[0] - 1] + " + " 
                               + numbers[result[1] - 1] + " = " + target);
        }

        sc.close();
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[] { left + 1, right + 1 }; 
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] { -1, -1 };
    }
}
