package units;

//Снайпер
public class Sniper extends Person{

    private int arrowsNum;
    boolean inGame = true;


    public Sniper (String name, int age){
        super(name, 60,40,age,20,30,"gun",40);
    }

    public void attack(Person person) {
        person.health -= super.power;
    }

    public boolean isInGame() {
        return this.arrowsNum == 0 ? false : true;
    }

    @Override
    public String toString(){
        return super.name;
    }
}
