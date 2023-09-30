package Codes;

public class Alien extends Entity {
    // Define any additional unique attributes for aliens here

    // Constructor for Alien
    public Alien(String name, int health, int damage) {
        super(name, health, damage);
        // Initialize any additional attributes for aliens here
    }

    // Method to activate alien-specific abilities (override from Entity)
    @Override
    public String useAbility() {
        // Implement alien-specific ability logic here
        return getName() + " uses a special alien ability.";
        // Add code to utilize or modify inherited abilities based on unique traits
    }

    // Define methods for alien-specific traits and abilities here
}
