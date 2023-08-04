package pets_amok;

public class Cat extends OrganicPet{


public Cat(String name, String description){
        super(name, description);
    }

    @Override
    public void cleanLitterBox() {
        setMaintenance(100);
    }

    @Override
    public void cleanCage() {
    }

    @Override
    public void walkDoggy() {
    }

}
