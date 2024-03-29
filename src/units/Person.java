package units;

import java.util.ArrayList;
import java.util.Random;

public abstract class Person implements MainInterface{
    protected String name;
    protected int distance;
    protected int prioritet;
    public int health;
    protected int power;
    protected int age;
    protected int armor;
    protected int endurance;         // Выносливость
    protected int gold;
    protected String weapon;
    public Position position;
    protected String className;
    protected int effectiveDist;

    public Person(String name, int prioritet, int health, int distance, int power, int age, int armor, int endurance,
                  String weapon, int gold, String className, int x, int y) {
        this.name = name;
        this.health = health;
        this.distance = distance;
        this.power = power;
        this.age = age;
        this.armor = armor;
        this.endurance = endurance;
        this.weapon = weapon;
        this.gold = gold;
        this.className = className;
        this.position = new Position(x, y);
        this.effectiveDist = effectiveDist;
        this.prioritet = prioritet;

    }

    @Override
    public String toString() {
        return (className + " >>> " + name + " " + "(" + position.getX() + "," + position.getY() + ")");
    }

    public int getDamage(int damage){
        int loss = damage - (this.armor * damage)/100;
        loss = Math.min(loss, this.health);
        this.health -= loss;
        if (this.health <= 0){
            System.out.println(name + "отомстите за меня!");
        }
        return loss;
    }

    protected int getRound(int origin, int percent){
        if(percent > origin)
            return origin;
        int n = (origin * percent) / 100;
        return origin + (new Random().nextInt(0, n * 2+1) - n);

    }

    public Person findTarget (ArrayList<Person> listHero){
        double minDist = Double.MAX_VALUE;
        Person tmp = null;
        for (Person hero : listHero) {
            if (position.getDistance(hero.position) < minDist){
                minDist = position.getDistance(hero.position);
                tmp = hero;
            }
        }
        return tmp;
    }
}






