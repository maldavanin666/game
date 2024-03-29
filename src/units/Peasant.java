package units;

import java.util.ArrayList;

// Крестьянин
public class Peasant extends Person {
    private int arrowsNum;
    boolean inGame = true;

    public Peasant(String name, int x, int y) {
        super(name, 0,20,1,1,25,60,40,"nothing",30,"Крестьянин", x, y);
    }

    public void giveArrows(int val) {
        this.arrowsNum -= val;
        if (!isInGame()) {
            inGame = false;
        }

    }

    public boolean isInGame() {
        return this.arrowsNum == 0 ? false : true;
    }

    @Override
    public void step(ArrayList<Person> enemies) {

    }
}
