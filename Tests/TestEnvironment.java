package Tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import Codes.Environment;
import Codes.Alien;
import Codes.Human;

public class TestEnvironment {
    private Environment environment;
    private Human human;
    private Alien alien;

    @Before
    public void setUp() {
        // Initialize the environment and entities before each test
        environment = new Environment();
        human = new Human("John", 100, 15, 20);
        alien = new Alien("Zog", 120, 18);
    }

    @Test
    public void testAddEntity() {
        // Add entities to the environment
        environment.addEntity(human);
        environment.addEntity(alien);

        // Check if entities were added successfully
        assertEquals(2, environment.getEntities().size());
        assertTrue(environment.getEntities().contains(human));
        assertTrue(environment.getEntities().contains(alien));
    }

    @Test
    public void testRemoveEntity() {
        // Add entities to the environment
        environment.addEntity(human);
        environment.addEntity(alien);

        // Remove an entity from the environment
        environment.removeEntity(human);

        // Check if the entity was removed successfully
        assertEquals(1, environment.getEntities().size());
        assertFalse(environment.getEntities().contains(human));
        assertTrue(environment.getEntities().contains(alien));
    }

    @Test
    public void testUpdateEnvironment() {
        // Add entities to the environment
        environment.addEntity(human);
        environment.addEntity(alien);

        // Update the environment (e.g., simulate interactions)
        environment.update();

        // Implement test cases to verify interactions or rules
        // For example, you can test if the entities' health changed after an update
    }

    public static void main(String[] args) {
        // Run the JUnit tests for the Environment class
        org.junit.runner.JUnitCore.main("TestEnvironment");
    }
}
