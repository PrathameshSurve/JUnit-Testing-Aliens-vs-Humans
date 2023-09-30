package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import Codes.Alien;

public class TestAlien {

    @Test
    public void testAlienUniqueTraits() {
        // Create an Alien object with unique traits
        Alien alien = new Alien("Zog", 120, 18);

        // Test if the Alien object has the correct attributes
        assertEquals("Zog", alien.getName());
        assertEquals(120, alien.getHealth());
        assertEquals(18, alien.getDamage());

        // Test an alien-specific ability
        alien.useAbility();
        // Add additional tests for alien-specific traits and abilities here
    }

    // You can add more test methods for other aspects of the Alien class here

}
