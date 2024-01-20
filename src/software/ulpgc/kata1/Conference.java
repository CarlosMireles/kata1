package software.ulpgc.kata1;

import java.util.ArrayList;
import java.util.List;

public class Conference {
    private final int capacity;
    private List<Person> participants;

    public Conference(int capacity) {
        this.capacity = capacity;
        this.participants = new ArrayList<>(capacity);
    }

    public int Capacity() {
        return capacity;
    }
    public int peopleEnlisted() {
        return this.participants.size();
    }
    public int notOccupied() {
        return Capacity() - peopleEnlisted();
    }
    public boolean enlist(Person person){
        if (peopleEnlisted() >= Capacity()) return false;
        return this.participants.add(person);
    }

    @Override
    public String toString() {
        return "Conference{" +
                "capacity=" + capacity +
                ", free=" + notOccupied() +
                '}';
    }
}
