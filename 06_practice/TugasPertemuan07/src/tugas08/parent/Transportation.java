package tugas08.parent;

public abstract class Transportation {

    public void move(String msg) {
        System.out.println(this.getClass().getSimpleName() + " has " + msg);
    }

    public abstract void takePassenger(int count);
}
