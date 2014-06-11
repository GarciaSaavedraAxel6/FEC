
package fire.emblem.copy;

abstract class Equipment extends Item{

    private int range;
    private int weight;

    // amount of experience granted per use
    private int experience;

    public Equipment(String name, int durability, int goldWorth,
                        int range, int weight, int experience) {
        super(name, durability, goldWorth);

        this.range = range;
        this.weight = weight;
        this.experience = experience;
    }

    public int getRange() {
        return range;
    }
    public int getWeight() {
        return weight;
    }
    public int getExperience() {
        return experience;
    }

    abstract int use(Unit user, Unit receiver);
}
