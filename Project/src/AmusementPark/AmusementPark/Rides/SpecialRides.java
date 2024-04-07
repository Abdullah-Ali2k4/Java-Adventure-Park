package AmusementPark.Rides;

public class SpecialRides extends Rides{
    private String specialFeature;
    public SpecialRides(String name, byte level, byte ageLimit, int ticketPrice,String specialFeature){
        super(name,level,ageLimit,ticketPrice);
        this.specialFeature = specialFeature;
    }
    public void ActivateSpecial(){
        System.out.println("Activated "+specialFeature);
    }

}
