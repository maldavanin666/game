package packHero;

import units.Person;

import java.util.ArrayList;

public class Attack extends Person {


    public Attack(String name, int prioritet, int health,int distance, int power, int age, int armor, int endurance, String weapon, int gold, String className, int x, int y) {
        super(name,prioritet, health, distance, power, age, armor, endurance, weapon, gold, className, x, y);
    }

    public void attack(Person person) {
        person.health -= this.power;
    }


    @Override
    public void step(ArrayList<Person> enemies) {

    }
}
