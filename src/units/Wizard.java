package units;

import packHero.Magic;

import java.util.ArrayList;

public class Wizard extends Magic {

    private int mana;
    private int healPrice;
    private int attackPrice;

    public Wizard(String name, int x, int y){
        super(name, 1, 80,7,30,25, 5,30,"Stick", 40,
                "Волшебник", x, y);
        this.mana = 10;
        this.healPrice = 2;
        this.attackPrice = 1;
    }


}
