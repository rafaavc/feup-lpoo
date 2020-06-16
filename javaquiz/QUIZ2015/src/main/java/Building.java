import java.util.*;

public class Building implements Facility {
    private String name;
    private int minFloor, maxFloor;
    private Set<Room> rooms;

    public Building(String name, int minFloor, int maxFloor) throws IllegalArgumentException {
        if (minFloor > maxFloor) throw new IllegalArgumentException();
        this.name = name;
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.rooms = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public int getMinFloor() {
        return minFloor;
    }

    public int getMaxFloor() {
        return maxFloor;
    }

    public boolean addRoom(Room r) {
        return this.rooms.add(r);
    }

    public int getCapacity() {
        return rooms.stream().reduce(0, (semiTotal, current) -> semiTotal + current.getCapacity(), Integer::sum);
    }

    public boolean canEnter(User u) {
        return rooms.stream().reduce(false, (currVal, r) -> currVal || r.canEnter(u), Boolean::logicalOr);
    }

    @Override
    public String toString() {
        return "Building(" + name + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return minFloor == building.minFloor &&
                maxFloor == building.maxFloor &&
                name.equals(building.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, minFloor, maxFloor);
    }
}
