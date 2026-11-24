package programminglaboratory1_week9;

import java.util.ArrayList;

public class Team {

    private ArrayList<GameCharacter> members;

    public Team() {
        this.members = new ArrayList<>();
    }

    public boolean addCharacter(GameCharacter character) {
        if (character == null) {
            return false;
        }
        if (findByName(character.getName()) != null) {
            System.out.println("Error: A character named '" + character.getName() + "' is already in the team.");
            return false;
        }
        members.add(character);
        System.out.println(character.getName() + " joined the team.");
        return true;
    }

    public boolean removeCharacter(String name) {
        GameCharacter target = findByName(name);
        if (target != null) {
            members.remove(target);
            System.out.println(name + " removed from the team.");
            return true;
        }
        System.out.println("Character '" + name + "' not found.");
        return false;
    }

    public GameCharacter findByName(String name) {
        for (GameCharacter member : members) {
            if (member.getName().equalsIgnoreCase(name)) {
                return member;
            }
        }
        return null;
    }

    public void attackAll(GameCharacter target) {
        for (GameCharacter member : members) {
            if (member.isAlive() && member instanceof Attacker) {
                int dmg = ((Attacker) member).attack(target);
                System.out.println(member.getName() + " attacked " + target.getName() + " for " + dmg + " damage.");
            }
        }
    }

    public void healTeam() {
        for (GameCharacter member : members) {
            if (member.isAlive() && member instanceof Supporter) {
                GameCharacter lowestRatioMember = getLowestHealthRatioMember();
                if (lowestRatioMember != null) {
                    int healed = ((Supporter) member).heal(lowestRatioMember);
                    System.out.println(member.getName() + " healed " + lowestRatioMember.getName() + " for " + healed + " HP.");
                }
            }
        }
    }

    private GameCharacter getLowestHealthRatioMember() {
        GameCharacter lowest = null;
        double minRatio = Double.MAX_VALUE;

        for (GameCharacter member : members) {
            if (member.isAlive()) {
                double ratio = (double) member.getHealth() / member.getMaxHealth();
                if (ratio < minRatio) {
                    minRatio = ratio;
                    lowest = member;
                }
            }
        }
        return lowest;
    }

    public int getTotalPower() {
        int total = 0;
        for (GameCharacter member : members) {
            if (member.isAlive()) {
                total += member.calculatePower();
            }
        }
        return total;
    }

    public void displayTeam() {
        System.out.println("=== TEAM ROSTER (Total Alive Power: " + getTotalPower() + ") ===");
        for (GameCharacter member : members) {
            String status = member.isAlive() ? "ALIVE" : "DEFEATED";
            System.out.println("[" + status + "] " + member.getCharacterInfo());
        }
        System.out.println("=============================================");
    }
}
