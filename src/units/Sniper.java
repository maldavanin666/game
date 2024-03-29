package units;

import packHero.Shooter;

import java.util.ArrayList;

//Снайпер
public class Sniper extends Shooter {

    private int arrowsNum;
    boolean inGame = true;


    public Sniper (String name, int x, int y){
        super(name, 3, 60,15,40,25,20,30,"gun",40,
                "Снайпер", x, y);
    }


}
