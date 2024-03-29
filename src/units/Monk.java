package units;

import packHero.Magic;

import java.util.ArrayList;

public class Monk extends Magic {
    private int mana;
    private int healVal;
    private int healPrice;


    public Monk(String name, int x, int y) {
        super(name, 1,60,7, 40, 25, 20, 40, "nothing", 40,
                "Монах", x, y);
    }

    public void heal(Person person, int val) {
        person.health += val;
        this.mana -= price("heal");
    }

    public void heal() {
        super.health += this.healVal;
        this.mana -= this.healPrice;
    }

    private int price(String action) {
        if (action == "heal") return healPrice;
        return 0;
    }

    @Override
    public void step(ArrayList<Person> enemies) {

    }
}
