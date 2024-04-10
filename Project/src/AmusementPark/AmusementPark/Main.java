package AmusementPark;

import AmusementPark.Park.Park;
import AmusementPark.Rides.Ride;
import AmusementPark.Rides.SpecialRide;
import AmusementPark.Ticket.TicketBooth;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        ArrayList<Visitor> visitors=new ArrayList<>();
        var adventureLand = new Park("ADVENTURE LAND ");
        adventureLand.addRide(new Ride("Bumper cars",(byte) 2,(byte)11,150));
        adventureLand.addRide(new Ride("Pendulum",(byte) 9,(byte)18,350));
        adventureLand.addRide(new SpecialRide("Roller Coaster",(byte) 9,(byte)18,350,"Moves at 200kph speed"));
        adventureLand.welcome();
        TicketBooth ticketBooth=new TicketBooth(adventureLand);
        ticketBooth.getTicket("Pendulum");
        ticketBooth.getTicket("Pendqwwe");
        ticketBooth.getTicket("Roller Coaster");
        adventureLand.displayTickets();
        adventureLand.availRide("Pendulum");
    }
}