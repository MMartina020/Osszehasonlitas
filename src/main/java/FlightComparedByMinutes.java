import java.util.Comparator;

public class FlightComparedByMinutes implements Comparator<Flight> {

    @Override
    public int compare(Flight o1, Flight o2) {
        return o1.getMinute()-o2.getMinute();
    }

}
