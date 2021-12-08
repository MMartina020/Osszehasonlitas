import java.util.Comparator;

public class FlightComparedBySeats implements Comparator<Flight> {

    @Override
    public int compare(Flight o1, Flight o2) {
        return o1.getSeats()-o2.getSeats();
    }

}
