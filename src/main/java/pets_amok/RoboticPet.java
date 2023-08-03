package pets_amok;

public class RoboticPet extends VirtualPet {

    @Override
    public void oiling() {
        setMaintenance(100);
    }

    // cannot be fed
}
