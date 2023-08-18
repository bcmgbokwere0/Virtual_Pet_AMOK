package pets_amok;

public class Cat extends OrganicPet{


public Cat(String name, String description){
        super(name, description);
    }
// cats dont need walkdoggy only dogs need it
    @Override
    public void cleanLitterBox() { // not sure how to fix this. Because cat doesnt have to handle the litterbox anymore
        setBladder(100);
    }


    // when cat bladder is too low it should make the public litter box suffer
    @Override
    public void cleanCage() {
    }



}
