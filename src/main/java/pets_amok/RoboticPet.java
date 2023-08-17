package pets_amok;

public abstract class RoboticPet extends VirtualPet {
    private int maintenance;

    public RoboticPet(String name, String description) {
        super(name, description);
        this.maintenance = 100;
    }

    @Override
    public void oiling() {
        setMaintenance(100);
        setMood(getMood() + 30);
        setHunger(getHunger() + 20);
        setThirst(getThirst() + 20);
    }

    public int getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(int maintenance) {
        this.maintenance = maintenance;
    }

    @Override
    public abstract void walkDoggy();

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
}
