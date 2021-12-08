import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {

    private static List<Flight> flight = new ArrayList<>();


    public static void main(String[] args) {
        System.out.println("Fut");
        load(readIn("src/main/resources/repuloutak.txt"));
        for (Flight flight : flight){
            System.out.println(flight);
        }
        System.out.println(Collections.max(flight));
    }
    private static void load(List<String> rows){
        for (String row : rows){
            flight.add(new Flight(row));
        }
    }
    private static List<String> readIn(String uri) {
        List<String> rows = new ArrayList<>();
        try{
            rows = Files.readAllLines(Paths.get(uri), Charset.forName("ISO-8859-1"));
    }catch (IOException ex)

    {
        System.out.println("Hiba" +ex.getMessage());
    }
        return rows;
    }
}
