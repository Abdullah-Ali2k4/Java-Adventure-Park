import AmusementPark.Park;
import AmusementPark.Rides.Rides;
import AmusementPark.Rides.SpecialRides;
import AmusementPark.Visitor;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Visitor> visitors=new ArrayList<>();
        var adventureLand = new Park("ADVENTURE LAND ");

        adventureLand.addRide(new Rides("Roller Coaster",(byte) 6,(byte)15,200));
        adventureLand.addRide(new Rides("Bumper cars",(byte) 2,(byte)11,150));
        adventureLand.addRide(new Rides("Pendulum",(byte) 9,(byte)18,350));
        adventureLand.addRide(new SpecialRides("Roller Coaster s",(byte) 9,(byte)18,350,"Moves at 200kph speed"));
        adventureLand.welcome();
        adventureLand.getRide("Roller Coaster s");
    }
}