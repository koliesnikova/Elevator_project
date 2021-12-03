import java.util.Scanner;

public class Main {
    static int floor;

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of floors in your house");
        int floor = scanner.nextInt();

        System.out.println("Which floor are you at now ?");
        int current_floor = scanner.nextInt();

        if (current_floor > floor) {
            System.out.println("ERROR : You are higher than your house");
        } else {
            floor = (int) (Math.random() * floor);
            Elevator elevator = new Elevator(floor);
            System.out.println("The elevator is now on floor " + floor);

            if (floor == current_floor) {
                System.out.println("Come in, elevator is on your floor ");
            } else {
                elevator.move(current_floor);
            }

            System.out.println("To which floor you need to go?");
            int destination_floor = scanner.nextInt();
            scanner.close();

            elevator.move(destination_floor);
        }
    }
}

