package lesson1;

public class Athlete implements Triathlete {
    private String name;
    private double runSpeed;
    private double swimSpeed;
    private double skiSpeed;
    private String medals;

    public Athlete(String name, double runSpeed, double swimSpeed, double skiSpeed) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.skiSpeed = skiSpeed;
        this.medals = "";
    }

    public String getName() {
        return name;
    }

    public double getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(double runSpeed) {
        if (runSpeed > 0) {
            this.runSpeed = runSpeed;
        }
    }

    public double getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(double swimSpeed) {
        if (swimSpeed > 0) {
            this.swimSpeed = swimSpeed;
        }
    }

    public double getSkiSpeed() {
        return skiSpeed;
    }

    public void setSkiSpeed(double skiSpeed) {
        if (skiSpeed > 0) {
            this.skiSpeed = skiSpeed;
        }
    }

    public void addMedal(String medal) {
        if (this.medals.length() != 0) {
            this.medals += "; ";
        }
        this.medals += medal;
    }

    @Override
    public String toString() {
        return name + (medals.length() > 0 ? (". Заработал медали: " + medals) : ".");
    }

    @Override
    public double run(Obstacle obst) {
        return obst.getOvercomingTime(this);
    }

    @Override
    public double swim(Obstacle obst) {
        return obst.getOvercomingTime(this);
    }

    @Override
    public double skiing(Obstacle obst) {
        return obst.getOvercomingTime(this);
    }
}
