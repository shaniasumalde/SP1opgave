import java.util.Arrays;

public class Main {

    import java.util.Arrays;

    public class Main {
        public static void main(String[] args) {


            // Iteration 1 : Variables

            String name = "Ragnar";
            int healthPoints = 85;
            int maxHealth = 100;
            int level = 5;
            int experiencePoints = 2300;
            double gold = 156.60;
            boolean lifequo = true;
            char characterClass = 'R';
            int xp = 2300 ;
            String[] inventory = {"Sword", "Shield", "Potion"};

            System.out.println("===CHARACTER SHEET===") ;
            System.out.println("Name " + name) ;
            System.out.println("Level " + level) ;
            System.out.println(healthPoints + "/" + maxHealth) ;
            System.out.println("XP  " + xp) ;
            System.out.println("Gold  " + gold) ;
            System.out.println("Alive? " + lifequo) ;

            System.out.println("Inventory: 3 Items " + Arrays.toString(inventory)) ;


            // Iteration 2: Control Structures

            System.out.println("===STATUS===") ;

            if (healthPoints < maxHealth * 0.25) {
                System.out.println("WARNING! : Health Critical !");
            }
            if (healthPoints <= 0) {
                lifequo = false;
            }
            if (characterClass == 'W') {
                System.out.println("Go Warrior!") ;

            }

        }

    }

}

