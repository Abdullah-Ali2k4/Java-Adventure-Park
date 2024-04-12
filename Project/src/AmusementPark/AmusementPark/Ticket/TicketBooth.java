package AmusementPark.Ticket;

import AmusementPark.Park.Park;
import AmusementPark.Rides.Ride;

public class TicketBooth{
    Park park;
    public TicketBooth(Park park){this.park=park;}
    public boolean getTicket(String ride){
        for (Ride r: park.getRide()){
            if(r.getName().contains(ride)){
                if (park.checkAge(r)) {
                    park.getVisitor().addTicket(r.getName());
                    return true;
                }else{
                    System.out.println("You are to young to ride this!!");
                }
            }
        }
            System.out.println("Ride not available!!");
        return false;
    }
}
