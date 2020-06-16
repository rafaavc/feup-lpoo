import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Room implements Facility {
    private final Building building;
    private final String number;
    private final int floor;
    private int capacity;
    private final Set<User> authorized;

    public Room(Building building, String number, int floor) throws IllegalArgumentException, DuplicateRoomException {
        if (floor < building.getMinFloor() || floor > building.getMaxFloor()) throw new IllegalArgumentException();
        this.building = building;
        this.number = number;
        this.floor = floor;
        this.capacity = 0;
        this.authorized = new HashSet<>();
        if (!this.building.addRoom(this)) throw new DuplicateRoomException();
    }

    public Room(Building building, String number, int floor, int capacity) throws IllegalArgumentException, DuplicateRoomException {
        this(building, number, floor);
        this.capacity = capacity;
    }

    public void authorize(User u) {
        authorized.add(u);
    }

    public boolean canEnter(User u) {
        return authorized.contains(u);
    }

    public Building getBuilding() {
        return building;
    }

    public String getNumber() {
        return number;
    }

    public int getFloor() {
        return floor;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return building.getName() + number;
    }

    @Override
    public String toString() {
        return "Room(" + building.getName() + "," + number + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return floor == room.floor &&
                building.equals(room.building) &&
                number.equals(room.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(building, number, floor);
    }
}
