package lesson1;

public class Pool extends Obstacle {
    private double length;
    private int count;

    public Pool(String name, double length, int count) {
        super(name);
        this.length = length;
        this.count = count;
    }

    @Override
    public double getOvercomingTime(Athlete athlete) {
        return length * count / athlete.getSwimSpeed();
    }

}
