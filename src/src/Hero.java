public class Hero {
    public static void main(String[] args) {



        //De andre opgaver 1 og 2:


        System.out.println("===STATUS===");

        if (healthPoints < maxHealth * 0.25) {
            System.out.println("WARNING! : Health Critical !");
        }
        if (healthPoints <= 0) {
            lifequo = false;
        }
        if (characterClass == 'W') {
            System.out.println("Class: Warrior the strongest!");
        }
        if (characterClass == 'M') {
            System.out.println("Class: Mage the mightest!");
        }
        if (characterClass == 'R') {
            System.out.println("Class: Rogue the best");
        }


        // Level System
        int xpThreshold = 10000 * level;
        if (experiencePoints >= xpThreshold) {
            System.out.println("Ready to level up!");
        }

// Inventory
        for (String item : inventory) {
            System.out.println("Inventory (" + inventory.length + "items):");
            for (String items : inventory) {
                System.out.println("- " + item);

            }
        }

// Combat
        System.out.println("===COMBAT===");
        int damageTaken = 30;
        int healthAfterDamage = healthPoints - damageTaken;
        System.out.println("Ragnar takes " + damageTaken + " damage!");
        System.out.println("Health status: " + healthAfterDamage + " Damage taken : " + damageTaken + " :(");

        if (healthAfterDamage > 0) {
            System.out.println(name + " is still alive");
        }


    }
}