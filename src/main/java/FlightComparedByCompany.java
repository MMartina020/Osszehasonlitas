import java.util.Comparator;

public class FlightComparedByCompany implements Comparator<Flight> {

    @Override
    public int compare(Flight o1, Flight o2) {
        return o1.getCompany().compareTo(o2.getCompany());
    }

}
