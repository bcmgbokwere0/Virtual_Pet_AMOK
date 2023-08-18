package pets_amok;

public abstract class RoboticPet extends VirtualPet {
    private int maintenance;

    public RoboticPet(String name, String description) {
        super(name, description);
        this.maintenance = 100;
    }

    public void oiling() {
        setMaintenance(100);
        setMood(getMood() + 30);
    }

    public int getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(int maintenance) {
        this.maintenance = maintenance;
    }

    public void tick() {
        setMaintenance(getMaintenance() - 5);

        if (getMaintenance() >= 100) {
            setMood(getMood() - 0);
        } else if (getMaintenance() >= 70) {
            setMood(getMood() - 5);
        } else if (getMaintenance() >= 40) {
            setMood(getMood() - 10);
        } else if (getMaintenance() >= 20) {
            setMood(getMood() - 20);
        }
    }
}
