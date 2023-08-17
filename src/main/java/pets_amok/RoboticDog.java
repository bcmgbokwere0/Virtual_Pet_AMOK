package pets_amok;

public class RoboticDog extends RoboticPet{

    public RoboticDog(String name, String description) {
        super(name, description);
    }

    @Override
    public void walkDoggy() {
        super.setMood(100);
    }
}
