public class Flight {
private String company;
private String departure;
private String destination;
private double minute;
private int seats;

    public Flight(String row) {
        String[] slices = row.split(":");
        this.company = slices[0];
        this.departure = slices[1];
        this.destination = slices[2];
        this.minute = Integer.parseInt((slices[3]));
        this.seats = Integer.parseInt((slices[4]));
    }



    @Override
    public String toString() {
        return "Flight{" +
                "company='" + company + '\'' +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                ", minute=" + minute +
                ", seats=" + seats +
                '}';
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getMinute() {
        return minute;
    }

    public void setMinute(double minute) {
        this.minute = minute;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

}
