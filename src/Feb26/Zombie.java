package Feb26;

public class Zombie extends Entity{
    public static final int LOW_HP = 300;
    int damage;

    public Zombie() {
        super(LOW_HP);
        this.damage = 70;
    }

    public void attack(Plant p) {
        p.takeDamage(damage);
    }
}
