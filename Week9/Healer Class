package programminglaboratory1_week9;

public class Healer extends GameCharacter implements Supporter {

    private int healAmount;

    public Healer(String name, int level, int maxHealth, int healAmount) {
        super(name, level, maxHealth);
        this.healAmount = Math.max(0, healAmount);
    }

    @Override
    public int calculatePower() {
        return getLevel() * 5 + healAmount;
    }

    @Override
    public int heal(GameCharacter target) {
        if (!this.isAlive() || target == null || !target.isAlive()) {
            return 0;
        }
        int totalHeal = healAmount + getLevel();
        return target.restoreHealth(totalHeal);
    }

    @Override
    public String getCharacterInfo() {
        return String.format("Healer [%s] | Level: %d | HP: %d/%d | HealPower: %d | Power: %d",
                getName(), getLevel(), getHealth(), getMaxHealth(), healAmount, calculatePower());
    }
}
