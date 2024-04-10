package AmusementPark.Park;

import AmusementPark.Rides.Ride;
import AmusementPark.Visitor;

import java.util.ArrayList;
import java.util.Scanner;

public class Park {
    private String name;
    private Visitor visitor;
    private ArrayList<Ride> rides = new ArrayList<>();

    public Park(String name) {
        this.name = name;
    }
    public ArrayList<Ride> getRide(){
        return rides;
    }
    public Visitor getVisitor(){return visitor;}
    Scanner input = new Scanner(System.in);
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
        System.out.print("Enter your age : ");
        visitor.setAge(input.nextByte());
        System.out.println("To Enter The Park You Need To Purchase Access Card\nPress Y To Get The Card");
        if (input.next().compareToIgnoreCase("y") == 0)
            visitor.setAccess(true);
        else
            visitor.setAccess(false);
    }
    public void displayTickets(){
        for(String s:visitor.getTickets()){
            System.out.println(s);
        }
    }

    public void addRide(Ride ride) {
        rides.add(ride);
    }
    public void availRide(String r){
        int counter=0;
        for (String ticket:visitor.getTickets()){
            counter++;
            for (Ride ride:rides){
                if(ride.getName().equals(r)){
                    System.out.println("Enjoy Your Ride");
                    visitor.getTickets().remove(counter);
                }
            }
        }
    }

    private void displayRides() {
        for (Ride ride : rides) {
            ride.info();
        }
    }
}
