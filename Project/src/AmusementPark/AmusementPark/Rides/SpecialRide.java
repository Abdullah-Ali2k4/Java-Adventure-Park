package AmusementPark.Rides;

public class SpecialRide extends Ride implements SpecialFeature{
    private String specialFeature;
    public SpecialRide(String name, byte level, byte ageLimit, int ticketPrice, String specialFeature){
        super(name,level,ageLimit,ticketPrice);
        this.specialFeature = specialFeature;
    }
    public SpecialRide(Ride ride, String specialFeature){
        super(ride);
        this.specialFeature = specialFeature;
    }
    @Override
    public void specialFeature() {
        System.out.println(specialFeature +"ACTIVATED");
    }
    @Override
    public void extraCharges() {
        System.out.println("To get Special features pay "+getTicketPrice()*.5+" rupees extra " );
    }
}
