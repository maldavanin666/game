package packHero;

import units.Person;

import java.util.ArrayList;

public class Shooter extends Person {

    protected int ammo;

    public Shooter(String name,int prioritet, int health, int distance, int power, int age, int armor, int endurance, String weapon, int gold, String className, int x, int y) {
        super(name, prioritet, health, distance, power, age, armor, endurance, weapon, gold, className, x, y);
    }


    public void attack(Person person) {
        person.health -= this.power;
    }

    protected void shot(Person target){
        System.out.println(name + " выстрелил");
        ammo--;
        double dist = position.getDistance(target.position);
        int damage = getRound(power, 10);
        if(dist > effectiveDist)
            damage *= 0.5f;
        else if(dist < effectiveDist)
            damage *= 1.2f;

        int res = target.getDamage(damage);
        System.out.println(" и нанес" + res + " урона");
        }


    @Override
    public void step(ArrayList<Person> enemies) {
        if (health <= 0 || ammo <= 0){
            if (ammo <= 0){
                System.out.println(name + ":" + " подайте стрелы!");
            }
            return;
        }

        Person target = this.findTarget(enemies);
        if (target != null){
            shot(target);
        }
    }
}
