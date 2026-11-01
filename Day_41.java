import java.util.Scanner;

class FairSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (int i = 1; i < n - 1; i++) {
            int left = 0, right = 0;

            for (int j = 0; j < i; j++)
                left += a[j];

            for (int j = i + 1; j < n; j++)
                right += a[j];

            if (left == right) {
                System.out.println("Fair Split: " + a[i]);
                System.out.println("Position: " + (i + 1));
                return;
            }
        }

        System.out.println("No Fair Split");
    }
}
