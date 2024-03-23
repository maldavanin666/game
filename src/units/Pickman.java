package units;

public class Pickman extends Person{
    public Pickman(String name, int age){
        super(name, 80,30,age,30,50,"pice", 40);
    }

    public void attack(Person person) {
        person.health -= this.power;
    }

    @Override
    public String toString(){
        return super.name;
    }
}
