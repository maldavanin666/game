package units;

public class Pickman extends Person{
    public Pickman(String name, int x, int y){
        super(name, 80,30,25,30,50,"pice", 40,
                "Копейщик", x, y);
    }

    public void attack(Person person) {
        person.health -= this.power;
    }

}
