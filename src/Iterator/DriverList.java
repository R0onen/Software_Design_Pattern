package Iterator;

import java.util.List;

public class DriverList implements DriverCollection {
    private List<Driver> drivers;

    public DriverList(List<Driver> drivers) {
        this.drivers = drivers;
    }

    @Override
    public DriverIterator createIterator() {
        return new DriverIterator(this.drivers);
    }
}

