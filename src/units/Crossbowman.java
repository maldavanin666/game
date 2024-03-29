package units;

import packHero.Shooter;

import java.util.ArrayList;

public class Crossbowman extends Shooter {

    protected int ammo;

    public Crossbowman(String name, int x, int y) {
        super(name, 3,60,15, 40, 25, 20, 40, "gun", 40,
                "Арбалетчик", x, y);
        this.ammo = ammo;
    }


}

