package packHero;

import units.Person;

import java.util.ArrayList;

public class Magic extends Person {

    private int mana;
    private int healVal;
    private int healPrice;
    private int attackPrice;

    public Magic(String name, int prioritet, int health, int distance, int power, int age, int armor, int endurance, String weapon, int gold, String className, int x, int y) {
        super(name, prioritet, health, distance, power, age, armor, endurance, weapon, gold, className, x, y);
    }

    public void attack(Person person) {
        person.health -= this.power;
        this.mana -= price("attack");
    }

    public void heal(Person person, int val){
        person.health += val;
        this.mana -= price("heal");
    }

    public void heal(){
        super.health += this.healVal;
        this.mana -= this.healPrice;
    }

    private int price(String action){
        if (action == "heal") return healPrice;
        else if (action == "attack") return attackPrice;
        return 0;
    }

    @Override
    public void step(ArrayList<Person> enemies) {

    }

    @Override
    public int getDamage(int damage){

        int res = super.getDamage(damage);
        if (health <= 0){

            System.out.println(name + ":" + "дальше без меня");

        }
        return res;
    }
}
