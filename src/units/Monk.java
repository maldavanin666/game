package units;

public class Monk extends Person {
    private int mana;
    private int healVal;
    private int healPrice;


    public Monk(String name, int x, int y) {
        super(name, 60, 40, 25, 20, 40, "nothing", 40,
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

}
