
package fire.emblem.copy;

public class Unit {

    final private String name;
    
    private int level;

    private int usedStatPoints;
    private int totalStatPoints;

    private int maxHealthPoints;
    private int strength;
    private int magic;
    private int speed;
    private int skill;
    private int luck;
    private int defense;
    private int resistance;

    private int currentHealthPoints;

    private Equipment equipment;
    
    public Unit(String name, int level, int healthPoints, int strength, int magic, int skill, int speed, int luck, int defense, int resistance) {
        this.name = name;

        this.level = level;

        totalStatPoints = strength + magic + skill + speed + luck + defense + resistance;
        usedStatPoints = totalStatPoints;

        this.maxHealthPoints = healthPoints;

        this.strength = strength;
        this.magic = magic;
        this.skill = skill;
        this.speed = speed;
        this.luck = luck;
        this.defense = defense;
        this.resistance = resistance;


        
        equipment = null;
    }

    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }
    public int getUsedStatPoints() {
        return usedStatPoints;
    }
    public int getTotalStatPoints() {
        return totalStatPoints;
    }
    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }
    public int getStrength() {
        return strength;
    }
    public int getMagic() {
        return magic;
    }
    public int getSpeed() {
        return speed;
    }
    public int getSkill() {
        return skill;
    }
    public int getLuck() {
        return luck;
    }
    public int getDefense() {
        return defense;
    }
    public int getResistance() {
        return resistance;
    }
    public int getCurrentHealthPoints() {
        return currentHealthPoints;
    }
    public Equipment getEquippedItem() {
        return equipment;
    }

    public Equipment equip(Equipment newEquipment) {
        Equipment oldEquipment = this.equipment;
        this.equipment = newEquipment;
        return oldEquipment;
    }

    public void useEquipmentOn(Unit receiver) {
        equipment.use(this, receiver);
    }
}
