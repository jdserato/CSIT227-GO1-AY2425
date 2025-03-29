package Feb26;

public abstract class Plant extends Entity{
    int sunCost;

    public Plant(int hp, int sunCost) {
        super(hp);
        this.sunCost = sunCost;
    }
    public Plant(int sunCost) {
        super(300);
        this.sunCost = sunCost;
    }
}
