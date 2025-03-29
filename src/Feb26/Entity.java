package Feb26;

public abstract class Entity {
    protected int hp;

    public Entity(int hp) {
        this.hp = hp;
    }

    public void takeDamage(int dmg) {
        hp -= dmg;
    }

    public boolean isAlive() {
        return hp > 0;
    }
}
