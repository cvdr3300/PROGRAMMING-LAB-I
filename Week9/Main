package programminglaboratory1_week9;

public class ProgrammingLaboratory1_Week9 {
    

        public static void main(String[] args) {
            Team heroes = new Team();

            System.out.println("--- Testing Invalid Stats ---");
            Warrior invalidHero = new Warrior("Rookie", 150, -20, 10);
            heroes.addCharacter(invalidHero);

            System.out.println("\n--- Creating Team ---");
            Warrior warrior = new Warrior("Aragorn", 10, 200, 30);
            Mage mage = new Mage("Gandalf", 12, 120, 60);
            Healer healer = new Healer("Elrond", 10, 140, 25);

            heroes.addCharacter(warrior);
            heroes.addCharacter(mage);
            heroes.addCharacter(healer);

            System.out.println("\n--- Testing Duplicate Name ---");
            heroes.addCharacter(new Mage("Gandalf", 5, 100, 40));

            Warrior enemy = new Warrior("Golem", 15, 400, 40);

            System.out.println("\n--- Initial Status ---");
            heroes.displayTeam();
            System.out.println("Enemy: " + enemy.getCharacterInfo());

            for (int round = 1; round <= 2; round++) {
                System.out.println("\n================ ROUND " + round + " ================");

                heroes.attackAll(enemy);
                System.out.println("Enemy HP after team attack: " + enemy.getHealth() + "/" + enemy.getMaxHealth());

                if (enemy.isAlive()) {
                    int dmg1 = enemy.attack(warrior);
                    System.out.println(enemy.getName() + " attacked " + warrior.getName() + " for " + dmg1 + " damage.");
                    int dmg2 = enemy.attack(mage);
                    System.out.println(enemy.getName() + " attacked " + mage.getName() + " for " + dmg2 + " damage.");
                }

                heroes.healTeam();
                heroes.displayTeam();
            }

            System.out.println("\n--- Search and Remove Operations ---");
            GameCharacter found = heroes.findByName("Elrond");
            if (found != null) {
                System.out.println("Found character: " + found.getCharacterInfo());
            }

            heroes.removeCharacter("Rookie");
            heroes.displayTeam();
        }
}
