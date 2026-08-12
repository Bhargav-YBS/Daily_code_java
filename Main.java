import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 10 seats: false = available, true = booked
        boolean[] seats = new boolean[10];

        System.out.print("Enter seat number (1-10): ");
        int seat = sc.nextInt();

        if (seat < 1 || seat > 10) {
            System.out.println("Invalid seat number");
        } 
        else if (seats[seat - 1]) {
            System.out.println("Seat " + seat + " is Not Available");
        } 
        else {
            seats[seat - 1] = true;
            System.out.println("Seat " + seat + " is Available");
            System.out.println("Ticket Booked Successfully!");
        }

        sc.close();
    }
}