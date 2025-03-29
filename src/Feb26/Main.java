package Feb26;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
//        list.get()
        ConeheadZombie cz = new ConeheadZombie();
        System.out.println(cz.hp + cz.cone.hp);
        Peashooter p = new Peashooter();
        while (p.isAlive() && cz.isAlive()) {
            p.attack(cz);
            cz.attack(p);
            System.out.println("Conehead HP : " + cz.hp + " + " + cz.cone.hp);
            System.out.println("Peashooter HP: " + p.hp);
        }
    }
}
