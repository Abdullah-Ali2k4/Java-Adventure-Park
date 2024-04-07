package AmusementPark;

import AmusementPark.Rides.Rides;
import AmusementPark.Rides.SpecialRides;

import java.util.ArrayList;
import java.util.Scanner;

public class Park {
    private String name;
    private ArrayList<Visitor> visitors = new ArrayList<>();
    private Visitor visitor;
    private ArrayList<Rides> rides = new ArrayList<>();

    public Park(String name) {
        this.name = name;
    }
    Scanner input = new Scanner(System.in);

    private void getVisitors() {
        for (Visitor visitor : visitors) {
            System.out.println(visitor.getName());
        }
    }

    public void welcome() {
        var input = new Scanner(System.in);
        System.out.println("Welcome to " + name);
        System.out.print("Press any key to proceed ");
        input.next();
        do {
            System.out.println("To View Rides Press R\nTo Access-Card Press A");
            String a = input.next();
            if (a.compareToIgnoreCase("A") == 0) {
                addVisitor();
                break;
            } else if (a.compareToIgnoreCase("r") == 0) {
                displayRides();
            }
        } while(true);
    }

    private void addVisitor() {

        System.out.print("Enter your name : ");
        visitor = new Visitor(new String(input.next()));
        visitors.add(visitor);
        System.out.print("Enter your age : ");
        visitors.getLast().setAge(input.nextByte());
        System.out.println("To Enter The Park You Need To Purchase Access Card\nPress Y To Get The Card");
        if (input.next().compareToIgnoreCase("y") == 0)
            visitors.getLast().setAccess(true);
        else
            visitors.remove(visitors.getLast());
    }

    public void addRide(Rides ride) {
        rides.add(ride);
    }

    private void displayRides() {
        for (Rides ride : rides) {
            ride.info();
        }
    }
    public void getRide(String name) {
        for (Rides ride:rides){
            if (name.equals(ride.getName())){
                if(visitor.getAge()>=ride.getAgeLimit()){
                    System.out.println("Press Y To Purchase "+name+" Ticket for rupees "+ride.getTicketPrice());
                    if(input.next().toLowerCase().equals("y")){
                        System.out.println("Enjoy your Ride!!!");
                        if(ride instanceof SpecialRides){
                            ((SpecialRides) ride).extraCharges();
                           var Ride=(SpecialRides)ride;
                            Ride.ActivateSpecial();
                        }
                    }
                }else {
                    System.out.println("Your are to Young for the ride ");
                }
            }
        }
    }
}
