import java.util.Comparator;

public class FlightComparedByMinutes implements Comparator<Flight> {

    @Override
    public int compare(Flight o1, Flight o2) {
        return (int)(100*(o1.getMinute()-o2.getMinute()));
    }
    //14.42
    //14.17
    //14.35
}
