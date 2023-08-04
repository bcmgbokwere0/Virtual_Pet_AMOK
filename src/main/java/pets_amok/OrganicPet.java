package pets_amok;

public abstract class OrganicPet extends VirtualPet{

    public OrganicPet(String name, String description){
        super(name, description);
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
    public void oiling(){

    }

}
