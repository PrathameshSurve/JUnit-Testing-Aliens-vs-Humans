package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import Codes.Human;

public class TestHuman {

    @Test
    public void testHumanConstructor() {
        // Test the constructor of the Human class
        Human human = new Human("John", 100, 15, 20);
        assertEquals("John", human.getName());
        assertEquals(100, human.getHealth());
        assertEquals(15, human.getDamage());
        assertEquals(20, human.getArmor());
    }

    @Test
    public void testHumanUseAbility() {
        // Test a human-specific ability
        Human human = new Human("Alice", 120, 18, 25);
        String abilityOutput = human.useAbility();

        // You can assert the results of the ability
        assertEquals("Alice uses a special human ability.", abilityOutput);
    }

    // Add more test methods to cover other aspects of the Human class
}
