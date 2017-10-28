package tugas08.child;

import tugas08.parent.Transportation;

public class Flight extends Transportation {
    @Override
    public void takePassenger(int count) {
        System.out.println(this.getClass().getSimpleName() + " take " + count + " passenger");
    }
}
