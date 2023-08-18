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
    }

        @Test
    public void testWalkingDog() {
        RoboticDog testingApp = new RoboticDog("Fido","a robotic dog");
        testingApp.walkDoggy();
        assertEquals(100, testingApp.getMood());
    }
}