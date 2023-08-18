package pets_amok;

public class Dog extends OrganicPet {
    private int cage;

    public Dog(String name, String description) {
        super(name, description);
    }

    public int getCage() {
        return cage;
    }

    public void setCage(int cage) {
        this.cage = cage;
    }

    @Override
    public void cleanCage() {
        setCage(100);
    }

    @Override
    public void walkDoggy() {
        super.setMood(100);
        setBladder(getBladder() + 30);
    }

    @Override
    public void cleanLitterBox() {
    }
}