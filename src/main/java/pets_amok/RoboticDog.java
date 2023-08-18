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

    @Override
    public void tick() {
        setMaintenance(getMaintenance() - 5);
        setTiredness(getTiredness() - 5);
        if (getMaintenance() >= 100) {
            setMood(getMood() - 0);
        } else if (getMaintenance() >= 70) {
            setMood(getMood() - 5);
        } else if (getMaintenance() >= 40) {
            setMood(getMood() - 10);
        } else if (getMaintenance() >= 20) {
            setMood(getMood() - 20);
        }
        if (getMaintenance() <= 0) {
            setCage(getCage() - 10);
        }
    }
}
