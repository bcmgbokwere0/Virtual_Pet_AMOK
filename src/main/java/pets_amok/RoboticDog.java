package pets_amok;

public class RoboticDog extends RoboticPet {
    private int cage;

    public RoboticDog(String name, String description) {
        super(name, description);
        setCage(100);
    }

    public int getCage() {
        return cage;
    }

    public void setCage(int cage) {
        this.cage = cage;
    }

    public void cleanCage() {
        setCage(100);
        setMood(getMood() + 20);
    }

    public void walkDoggy() {
        super.setMood(100);
    }
}
