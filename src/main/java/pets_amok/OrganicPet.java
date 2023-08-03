package pets_amok;

public class OrganicPet extends VirtualPet implements Dog, Cat {

    @Override
    public void setMaintenance(int newMaintenance) {
        super.setMaintenance(newMaintenance);
    }

    public void feed() {
        setHunger(getHunger() + 20);
    }

    public void drink() {
        setThirst(getThirst() + 20);
    }


    @Override
    public void cleanLitterBox() {
        super.setMaintenance(100);
    }

    @Override
    public void cleanCage(){
        super.setMaintenance(100);
    }

    @Override
    public void walkDoggy() {
        super.setMaintenance(getMaintenance() + 5);
        setMood(getMood() + 30);
    }

}
