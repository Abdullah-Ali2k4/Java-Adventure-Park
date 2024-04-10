package AmusementPark.Rides;

public class Ride {
    private String name;
    private byte level;
    private byte ageLimit;
    private int ticketPrice;

    public Ride(String name, byte level, byte ageLimit, int ticketPrice) {
        this.name = name;
        this.level = level;
        this.ageLimit = ageLimit;
        this.ticketPrice = ticketPrice;
    }
    public Ride(Ride r) {
        r.name = name;
        r.level = level;
        r.ageLimit = ageLimit;
        r.ticketPrice = ticketPrice;
    }

    public void info(){
        System.out.println(name.toUpperCase()+"\nLevel "+level+"\nAge Limit "+ageLimit+"\nTicket Price "+ticketPrice+"\n\n");
    }
    public String getName(){
        return name;
    }
    public byte getAgeLimit(){
        return ageLimit;
    }
    public int getTicketPrice() {
        return ticketPrice;
    }

}
