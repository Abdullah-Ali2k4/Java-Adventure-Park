package AmusementPark;

import AmusementPark.Park.Park;
import AmusementPark.Rides.Ride;
import AmusementPark.Rides.SpecialRide;
import AmusementPark.Ticket.TicketBooth;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var adventureLand = new Park("ADVENTURE LAND ");
        adventureLand.addRide(new Ride("Bumper cars",(byte) 2,(byte)11,150));
        adventureLand.addRide(new Ride("Pendulum",(byte) 9,(byte)18,350));
        adventureLand.addRide(new SpecialRide("Roller Coaster",(byte) 9,(byte)20,350,"Speed of 200kph"));
        adventureLand.welcome();
        TicketBooth ticketBooth=new TicketBooth(adventureLand);
        options(adventureLand,ticketBooth);
    }
    public static void options(Park park,TicketBooth ticketBooth){
        while (true) {
            System.out.println("Enter [A] to Avail the ride\nEnter [G] to get Ticket\nEnter [D] to display Rides\nEnter [T] to display Tickets");
            var input=new Scanner(System.in);
            switch (input.next().toUpperCase()){
                case "A": {
                    System.out.println("Name of the ride you wanna Avail :");
                    input.nextLine();
                    String ride=input.nextLine();
                    park.availRide(ride);

                }break;
                case "G":{
                    System.out.println("Name of the ride you wanna Purchase Ticket of :");
                    input.nextLine();
                    String ride=input.nextLine();
                    System.out.println(ticketBooth.getTicket(ride));

                }break;
                case "D":{
                    park.displayRides();

                }break;
                case "T":{
                    park.displayTickets();

                }break;
                default:{
                    System.out.println("Enter the directed keys ");
                }
            }
        }
    }
}