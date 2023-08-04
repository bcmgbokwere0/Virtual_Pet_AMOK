package pets_amok;

public class Dog extends OrganicPet {

    public Dog(String name, String description) {
        super(name, description);
    }

    @Override
    public void cleanCage() {
        super.setMaintenance(100);
    }

    @Override
    public void walkDoggy() {
        super.setMood(100);
        super.setMaintenance(getMaintenance() + 30);
    }

    @Override
    public void cleanLitterBox() {
    }
}