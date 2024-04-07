package AmusementPark.Rides;

public class Rides {
    private String name;
    private byte level;
    private byte ageLimit;
    private int ticketPrice;

    public Rides(String name, byte level, byte ageLimit, int ticketPrice) {
        this.name = name;
        this.level = level;
        this.ageLimit = ageLimit;
        this.ticketPrice = ticketPrice;
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
