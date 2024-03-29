package units;

import packHero.Attack;

import java.util.ArrayList;

// Разбойник
public class Robber extends Attack {

    public Robber(String name, int x, int y) {
        super(name, 2, 100,3, 20, 25, 20, 40, "knife", 50,
                "Разбойник", x, y);
    }

}
