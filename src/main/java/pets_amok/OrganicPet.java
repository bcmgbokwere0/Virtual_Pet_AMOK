package pets_amok;

public abstract class OrganicPet extends VirtualPet {
    private int thirst;
    private int hunger;

    public OrganicPet(String name, String description) {
        super(name, description);
        this.hunger = 100;
        this.thirst = 100;
    }

    // setters and getters

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    @Override
    public void feed() {
        super.setHunger(getHunger() + 20);
    }

    @Override
    public void drink() {
        setThirst(getThirst() + 20);
    }

    @Override
    public abstract void cleanLitterBox();

    @Override
    public abstract void cleanCage();

    @Override
    public abstract void walkDoggy();

    @Override
    public void oiling() {

    }

}
