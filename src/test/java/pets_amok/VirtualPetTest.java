package pets_amok;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VirtualPetTest {
    @Test
    public void testingOrganicNames() {
        OrganicPet testingApp = new Cat("Zebra","an animal");
        assertEquals("Zebra", testingApp.getName(), "Cat should be named Zebra");
    }

        @Test
    public void testRoboticOiling() {
        RoboticPet testingApp = new RoboticDog("Frank", "the robot");
        testingApp.oiling();
        assertEquals(100, testingApp.getMaintenance());
        assertEquals(130, testingApp.getMood());
        assertEquals(120, testingApp.getHunger());
        assertEquals(120, testingApp.getThirst());
    }

        @Test
    public void testWalkingDog() {
        OrganicPet testingApp = new Dog("Fido","a dog");
        testingApp.walkDoggy();
        assertEquals(100, testingApp.getMood());
        assertEquals(130, testingApp.getBladder());
    }
}