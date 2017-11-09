package lsg.weapons;

public class Weapon {

    public static final String DURABILITY_STAT_STRING = "durability";

    private String name;
    private int minDamage;
    private int maxDamage;
    private int stamCost;
    private int durability;

    public Weapon(String name, int minDamage, int maxDamage, int stamCost, int durability) {
        this.name = name;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.stamCost = stamCost;
        this.durability = durability;
    }

    public String getName() {
        return name;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public int getStamCost() {
        return stamCost;
    }

    public int getDurability() {
        return durability;
    }

    private void setDurability(int durability) {
        this.durability = durability;
    }

    public void use() {
        durability--;
    }

    public boolean isBroken() {
        return(durability<=0);
    }

    @Override
    public String toString() {
        return (name + " (min:" + minDamage + " max:" + maxDamage + " stam:" + stamCost + " " + DURABILITY_STAT_STRING.substring(0, 3) + ":" + durability + ")");
    }
}
