import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        hero.takeDamage(30);
        hero.heal(20);
        hero.printInventory();

        // Iteration 3: Methods

        class Hero {

                String name = "Ragnar";
                int healthPoints = 85;
                int maxHealth = 100;
                int level = 5;
                int experiencePoints = 2300;
                double gold = 156.60;
                boolean lifequo = true;
                char characterClass = 'R';
                int xp = 2300;
                String[] inventory = {"Sword", "Shield", "Potion"};


                Hero(String name, int health, int maxHealth, int level, int experiencePoints, double gold,
                boolean lifequo, char chracterClass, String[] inventory){
                    this.name = name;
                    this.healthPoints = healthPoints;
                    this.maxHealth = maxHealth;
                    this.level = level;
                    this.experiencePoints = experiencePoints;
                    this.gold = gold;
                    this.lifequo = lifequo;
                    this.characterClass = characterClass;
                    this.inventory = inventory;
                }


            void printCharacterSheet()  {
                printCharacterSheet() ;

                System.out.println("===CHARACTER SHEET===");
                System.out.println("Name: " + name);
                System.out.println("Level " + level);
                System.out.println(healthPoints + "/" + maxHealth);
                System.out.println("XP: " + xp);
                System.out.println("Gold amount :" + gold);
                System.out.println("Alive? " + lifequo);

                System.out.println("Inventory: 3 Items " + Arrays.toString(inventory));
            }

            void takeDamage(int amount) {

                int damageTaken = 30 ;
                int healthAfterDamage = healthPoints - damageTaken ;

                healthAfterDamage = healthPoints - damageTaken ;
               if (healthAfterDamage <= 0  ) {
                   lifequo = false;
                   System.out.println("You are dead !");

               } else if (healthAfterDamage >= 1) {
                       lifequo = true ;
                       System.out.println(name + " is still alive") ;
                   }
               }

               void heal(int amount) {
                    healthPoints = healthPoints + amount;
                    if (healthPoints > maxHealth) {
                        healthPoints = maxHealth ;
                    }
               }

               void addGold(double amount)  {
                    gold = gold + amount ;
            }

            boolean removeGold(double amount) {
                if (gold <= amount) {
                    gold = gold - amount;
                    return true ;
                } else if (gold <= 0) {
                    return false;
                }
            }

            void addXP(int amount) {

            }

            void levelUp() {
            }

            boolean isHealthCritical()  {
            }

            boolean isAlive() {
            }

            double getHealthPercentage() {
            }

            void printInventory() {
            }
            }

        }




    }




