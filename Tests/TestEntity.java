package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import Codes.Entity;

public class TestEntity {

    @Test
    public void testDealDamage() {
        // Create two Entity objects for testing
        Entity entity1 = new Entity("Entity1", 100, 10);
        Entity entity2 = new Entity("Entity2", 80, 12);

        // Entity1 deals damage to Entity2
        entity1.dealDamage(entity2);

        // Assert that Entity2's health has decreased
        assertEquals(80 - 10, entity2.getHealth());
    }

    @Test
    public void testTakeDamage() {
        // Create an Entity object for testing
        Entity entity = new Entity("Entity", 100, 10);

        // Entity takes damage
        entity.takeDamage(20);

        // Assert that Entity's health has decreased
        assertEquals(100 - 20, entity.getHealth());
    }

    @Test
    public void testEntityName() {
        // Create an Entity object with a specific name
        Entity entity = new Entity("TestEntity", 100, 10);

        // Assert that the entity's name is set correctly
        assertEquals("TestEntity", entity.getName());
    }

    @Test
    public void testNegativeDamage() {
        // Create an Entity object for testing
        Entity entity = new Entity("Entity", 100, 10);

        // Entity takes negative damage (should not change health)
        entity.takeDamage(-5);

        // Assert that Entity's health remains the same
        assertEquals(100, entity.getHealth());
    }

    // Add more test methods to cover other Entity functionalities.

}
