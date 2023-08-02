package pets_amok;

public class OrganicPet extends VirtualPet implements Dog, Cat {

    @Override
    public void setMaintenance(int newMaintenance) {
        super.setMaintenance(newMaintenance);
    }

    @Override
    public void cleanLitterBox() {
        super.setMaintenance(100);
    }

    @Override
    public void walkDoggy() {
        setMaintenance(100);
        setMood(getMood() + 30);
    }

    // Cat needs litter box and dog needs a cage. cannot be oiled
}
