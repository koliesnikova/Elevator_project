public class Elevator {
    private int floor_now;

    public Elevator(int floor_k) {
        this.floor_now = floor_k;

    }

    public int getFloor_now() {
        return floor_now;
    }

    // floor -> floor to go from user
    public void move(int floor) {
        int direction;
        if (floor_now < floor) {
            System.out.println(" Going ↑↑↑↑↑");
            direction = 1;
        } else {
            System.out.println(" Going ↓↓↓↓↓");
            direction = -1;
        }
        while (floor_now != floor) {
            floor += direction;
        }
        System.out.println("Elevator is on your floor ");
    }
}
