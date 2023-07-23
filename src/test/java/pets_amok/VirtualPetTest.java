package pets_amok;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VirtualPetTest {
    @Test
    public void testFunctionality() {
        Application testingApp = new Application();
        assertEquals("Hello", testingApp.getGreeting(), "app should have Hello");
    }
}
