package units;

public abstract class Person {
    protected int health;
    protected String name;
    protected int power;
    protected int age;
    protected int armor;
    protected int endurance;         // Выносливость
    protected int gold;
    protected String weapon;

    public Person(String name, int health, int power, int age, int armor, int endurance,
                  String weapon, int gold){
        this.name = name;
        this.health = health;
        this.power = power;
        this.age = age;
        this.armor = armor;
        this.endurance = endurance;
        this.weapon = weapon;
        this.gold = gold;

    }
}






