
package fire.emblem.copy;

abstract class Weapon extends Equipment{

    private static final int MAX_FORGE_MIGHT = 5;
    private static final int MAX_FORGE_HIT = 5;
    private static final int MAX_FORGE_CRIT = 3;
    // private WeaponType weaponType;
    //

    public enum WeaponRank {
        S(1), A(2), B(3), C(4), D(5), E(6);

        private int value;

        WeaponRank(int value) {
            this.value = value;
        }

    }
    
    private WeaponRank weaponRank;
    
    private int might;
    private int mightForgeLevel;

    private int hitChance;
    private int hitForgeLevel;

    private int critChance;
    private int critForgeLevel;

    public Weapon(String name, int durability, int goldWorth, int range, int weight, int experience,
                    int might, int hitChance, int critChance) {
        super(name, durability, goldWorth, range, weight, experience);

        this.might = might;
        this.hitChance = hitChance;
        this.critChance = critChance;

        mightForgeLevel = 0;
        hitForgeLevel = 0;
        critForgeLevel = 0;
    }

    public int getMight() {
        return might;
    }
    public int getHitChance() {
        return hitChance;
    }
    public int getCritChance() {
        return critChance;
    }

    public void forgeMight() {
        if (mightForgeLevel < MAX_FORGE_MIGHT) {
            might += 1;
            mightForgeLevel++;
        }
    }
    public void forgeHitChance() {
        if (hitForgeLevel < MAX_FORGE_HIT) {
            hitChance += 5;
            hitForgeLevel++;
        }
    }
    public void forgeCritChance() {
        if (critForgeLevel < MAX_FORGE_CRIT) {
            critChance += 3;
            critForgeLevel++;
        }
    }

    public boolean hasBeenForged() {
        if (mightForgeLevel > 0 || hitForgeLevel > 0 || critForgeLevel > 0) {
            return true;
        } else {
            return false;
        }
    }

}
