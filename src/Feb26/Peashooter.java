package Feb26;

public class Peashooter extends Plant{
    int damage = 20;

    public Peashooter() {
        super(100);
    }

    public void attack(Zombie z) {
        z.takeDamage(damage);
    }
}
