package tugas08;

import tugas08.child.Cow;
import tugas08.child.Flight;

public class Main08 {
    public static void main(String[] args) {
        Flight flight = new Flight();
        flight.move("Depart");
        flight.takePassenger(4);

        Cow cow = new Cow();
        cow.eat("grass");
        cow.makeNoise();
    }
}
