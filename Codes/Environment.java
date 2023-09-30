package Codes;

import java.util.ArrayList;
import java.util.List;

public class Environment {
    private List<Entity> entities;

    public Environment() {
        entities = new ArrayList<>();
    }

    // Add an entity to the environment
    public void addEntity(Entity entity) {
        entities.add(entity);
    }

    // Remove an entity from the environment
    public void removeEntity(Entity entity) {
        entities.remove(entity);
    }

    // Update the environment (e.g., handle interactions)
    public void update() {
        // Implement logic for interactions between entities in the environment
        // You can iterate through the list of entities and apply rules for interactions
    }

    // Get a list of all entities in the environment
    public List<Entity> getEntities() {
        return entities;
    }

    // Add more methods as needed to manage other game elements within the
    // environment
}
