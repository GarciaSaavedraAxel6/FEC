
package fire.emblem.copy;

abstract class Item {

    private String name;

    // durability == -1, for infinite uses
    private int durability;

    private int goldWorth;

    public Item(String name, int durability, int goldWorth) {
        this.name = name;
        this.durability = durability;
        this.goldWorth = goldWorth;
    }

    public String getName() {
        return name;
    }
    public int getDurability() {
        return durability;
    }
    public int getGoldWorth() {
        return goldWorth;
    }

    public void setDurability(int newDurability) {
        if (durability != -1) {
            durability = newDurability;
        }
    }
    public void decrementDurability() {
        if (durability > 1) {
            durability -= 1;
        }
    }

}
