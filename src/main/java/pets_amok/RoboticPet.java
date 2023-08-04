package pets_amok;

public class RoboticPet extends VirtualPet {

    public RoboticPet(String name, String description) {
        super(name, description);
    }

    @Override
    public void oiling() {
        setMaintenance(100);
        setMood(getMood() + 30);
        setHunger(getHunger() + 20);
        setThirst(getThirst() + 20);
    }

    // cannot be fed
    @Override
    public void feed() {
    }

    @Override
    public void drink() {

    }

    @Override
    public void cleanLitterBox() {
    }

    @Override
    public void cleanCage() {
    }

    @Override
    public void walkDoggy() {
    }
}
