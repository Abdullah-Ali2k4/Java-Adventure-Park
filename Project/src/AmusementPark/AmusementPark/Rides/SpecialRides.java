package AmusementPark.Rides;

public class SpecialRides extends Rides implements SpecialFeature{
    private String specialFeature;
    public SpecialRides(String name, byte level, byte ageLimit, int ticketPrice,String specialFeature){
        super(name,level,ageLimit,ticketPrice);
        this.specialFeature = specialFeature;
    }
    public SpecialRides(Rides ride,String specialFeature){
        super(ride);
        this.specialFeature = specialFeature;
    }
    public void ActivateSpecial(){
        System.out.println("Activated "+specialFeature);
    }

    @Override
    public void specialFeature() {

    }

    @Override
    public void extraCharges() {
        System.out.println("To get Special features pay "+getTicketPrice()*.5+" rupees extra " );
    }
}
