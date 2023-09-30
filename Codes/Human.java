package Codes;

public class Human extends Entity {
    private int armor;

    public Human(String name, int health, int damage, int armor) {
        super(name, health, damage);
        this.armor = armor;
    }

    // Method to activate human-specific abilities (override from Entity)
    @Override
    public String useAbility() {
        // Implement human-specific ability logic here
        return getName() + " uses a special human ability.";
        // You can add code to utilize or modify inherited abilities based on unique
        // traits

    }

    public int getArmor() {
        return armor;
    }

    // Method for a specific human trait or ability
    public void specialHumanTrait() {
        // Implement logic for a human-specific trait or ability here
        System.out.println(getName() + " exhibits a special human trait.");
    }

    // Implement methods for human-specific abilities here, if any
}
