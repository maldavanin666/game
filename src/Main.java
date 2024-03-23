import units.*;

public class Main {
    public static void main(String[] args) {
        Robber robber = new Robber("Andrey", 20);
        Peasant peasant = new Peasant("Alex", 20);
        Crossbowman crossbowman = new Crossbowman("Vitalik", 20);
        Monk monk = new Monk("Sergey", 20);
        Pickman pickman = new Pickman("Anatoly", 20);
        Sniper sniper = new Sniper("Dmitry", 20);
        Wizard wizard = new Wizard("Vanya", 20);

        System.out.println(robber);
        System.out.println(peasant);
        System.out.println(crossbowman);
        System.out.println(monk);
        System.out.println(pickman);
        System.out.println(sniper);
        System.out.println(wizard);
    }

}