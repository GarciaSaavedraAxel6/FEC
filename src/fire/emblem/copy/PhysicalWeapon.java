
package fire.emblem.copy;

public class PhysicalWeapon extends Weapon {

    public PhysicalWeapon(String name, int durability, int goldWorth, int range, int weight, int experience, int might, int hitChance, int critChance) {
        super(name, durability, goldWorth, range, weight, experience, might, hitChance, critChance);
    }

    @Override
    int use(Unit user, Unit receiver) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
