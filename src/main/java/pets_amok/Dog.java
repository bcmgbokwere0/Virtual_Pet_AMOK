package pets_amok;

public class Dog extends OrganicPet {
    private int cage;

    public Dog(String name, String description) {
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
        setMood(100);
        setBladder(getBladder() + 30);
    }

    @Override
    public void tick() {
        setHunger(getHunger() - 5);

        setThirst(getThirst() - 5);

        setTiredness(getTiredness() - 5);

        setBladder(getBladder() - 5);

        if (getBladder() >= 100) {
            setMood(getMood() - 0);
        } else if (getBladder() >= 70) {
            setMood(getMood() - 5);
        } else if (getBladder() >= 40) {
            setMood(getMood() - 10);
        } else if (getBladder() >= 20) {
            setMood(getMood() - 20);
        }

        if (getBladder() <= 0) {
            setCage(getCage() - 10);
        }
    }
}