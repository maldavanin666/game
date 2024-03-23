package units;

public class Monk extends Person {
    private int mana;
    private int healVal;
    private int healPrice;


    public Monk(String name, int age) {
        super(name, 60, 40, age, 20, 40, "nothing", 40);
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
    public String toString(){
        return super.name;
    }
}
