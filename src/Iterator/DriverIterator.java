package Iterator;

import java.util.List;

public class DriverIterator {
    private List<Driver> drivers;
    private int position = 0;

    public DriverIterator(List<Driver> drivers) {
        this.drivers = drivers;
        this.drivers.sort((d1, d2) -> Double.compare(d1.getDistanceFromClient(), d2.getDistanceFromClient()));
    }

    public boolean hasNext() {
        return position < drivers.size();
    }

    public Driver next() {
        if (!hasNext()) {
            return null;
        }
        return drivers.get(position++);
    }
}

