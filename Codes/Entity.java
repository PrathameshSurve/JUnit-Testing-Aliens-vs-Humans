package Codes;

public class Entity {
    // Define instance variables
    private String name;
    private int health;
    private int damage;

    // Constructor to initialize variables
    public Entity(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    // Getter methods for name, health, and damage
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    // Method for dealing damage to another entity
    public void dealDamage(Entity target) {
        target.takeDamage(this.damage);
    }

    // Method for taking damage
    public void takeDamage(int amount) {
        health -= amount;
        if (health <= 0) {
            System.out.println(name + " has been defeated.");
        }
    }

    // Method for activating skills and abilities (to be overridden by subclasses)
    public String useAbility() {
        // Placeholder method
        return getName() + " uses a special human ability.";
    }
}
