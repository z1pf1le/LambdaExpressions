package Baeldung;

import java.util.Comparator;

public class BicycleComparator{

    public int compare(Bicycle a, Bicycle b) {
        return a.getFrameSize().compareTo(b.getFrameSize());
    }

}
