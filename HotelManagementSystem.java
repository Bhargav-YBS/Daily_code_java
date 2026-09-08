import java.util.ArrayList;
import java.util.Scanner;

class Room {
    private int roomNumber;
    private String roomType;
    private boolean isOccupied;
    private String guestName;

    public Room(int roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isOccupied = false;
        this.guestName = "";
    }

    public int getRoomNumber() { return roomNumber; }
    public String getRoomType() { return roomType; }
    public boolean isOccupied() { return isOccupied; }
    public String getGuestName() { return guestName; }

    public void checkIn(String guestName) {
        this.isOccupied = true;
        this.guestName = guestName;
    }

    public void checkOut() {
        this.isOccupied = false;
        this.guestName = "";
    }

    @Override
    public String toString() {
        String status = isOccupied ? "Occupied by " + guestName : "Available";
        return "Room " + roomNumber + " [" + roomType + "] - " + status;
    }
}

class Hotel {
    private String name;
    private ArrayList<Room> rooms;

    public Hotel(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void displayAvailableRooms() {
        System.out.println("\n--- Available Rooms ---");
        boolean found = false;
        for (Room room : rooms) {
            if (!room.isOccupied()) {
                System.out.println(room);
                found = true;
            }
        }
        if (!found) System.out.println("No rooms available.");
    }

    public void displayAllRooms() {
        System.out.println("\n--- All Room Statuses ---");
        for (Room room : rooms) {
            System.out.println(room);
        }
    }

    public Room findRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }
}

public class HotelManagementSystem {
    public static void main(String[] args) {
        Hotel myHotel = new Hotel("Grand Vista Resort");
        
        myHotel.addRoom(new Room(101, "Single"));
        myHotel.addRoom(new Room(102, "Single"));
        myHotel.addRoom(new Room(201, "Double"));
        myHotel.addRoom(new Room(202, "Suite"));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Grand Vista Management System =====");
            System.out.println("1. View Available Rooms");
            System.out.println("2. View All Rooms");
            System.out.println("3. Check-In Guest");
            System.out.println("4. Check-Out Guest");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter a number: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    myHotel.displayAvailableRooms();
                    break;
                case 2:
                    myHotel.displayAllRooms();
                    break;
                case 3:
                    System.out.print("Enter room number to book: ");
                    int roomNumIn = scanner.nextInt();
                    scanner.nextLine();
                    Room roomIn = myHotel.findRoom(roomNumIn);
                    
                    if (roomIn == null) {
                        System.out.println("Error: Room does not exist.");
                    } else if (roomIn.isOccupied()) {
                        System.out.println("Error: Room is already occupied.");
                    } else {
                        System.out.print("Enter guest name: ");
                        String name = scanner.nextLine();
                        roomIn.checkIn(name);
                        System.out.println("Check-in successful for " + name + " in Room " + roomNumIn);
                    }
                    break;
                case 4:
                    System.out.print("Enter room number for check-out: ");
                    int roomNumOut = scanner.nextInt();
                    scanner.nextLine();
                    Room roomOut = myHotel.findRoom(roomNumOut);
                    
                    if (roomOut == null) {
                        System.out.println("Error: Room does not exist.");
                    } else if (!roomOut.isOccupied()) {
                        System.out.println("Error: Room is already empty.");
                    } else {
                        System.out.println("Guest " + roomOut.getGuestName() + " checked out successfully.");
                        roomOut.checkOut();
                    }
                    break;
                case 5:
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please pick between 1 and 5.");
            }
        } while (choice != 5);

        scanner.close();
    }
}


