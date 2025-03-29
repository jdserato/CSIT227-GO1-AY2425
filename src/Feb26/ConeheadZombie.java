package Feb26;

public class ConeheadZombie extends Zombie{
    Cone cone;

    ConeheadZombie() {
        super();
        cone = new Cone();
    }

    @Override
    public void takeDamage(int dmg) {
        if (cone.isAlive()) {
            cone.takeDamage(dmg);
        } else {
            super.takeDamage(damage);
        }
     }
}
