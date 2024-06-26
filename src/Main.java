import packHero.Shooter;
import units.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static ArrayList<Person> hollyTeam;
    public static ArrayList<Person> darkTeam;
    public static ArrayList<Person> all = new ArrayList<>();

    public static void main(String[] args) {
        hollyTeam = teamCreate(0, 0);
        darkTeam = teamCreate(0, 3);

        all.addAll(hollyTeam);
        all.addAll(darkTeam);
        all.sort(new PriorityClass());

        for (Person p : all){
            System.out.println(p + " ходит" );
            if (hollyTeam.contains(p)){
                p.step(darkTeam);
            } else {
                p.step(hollyTeam);
            }
        }





//        System.out.println(hollyTeam);
//        System.out.println();
//        System.out.println(darkTeam);


        //Shooter.step();


//        List<Person> listHero1 = new ArrayList<>();
//        listHero1.add(new Crossbowman(fillName(), 0, 0));
//
//        ArrayList<Person> listHero = new ArrayList<>();
//        listHero.add(new Crossbowman(fillName(), 0, 0));
//        listHero1.get(0).step(listHero);
//        System.out.println((Crossbowman)(listHero1.get(0).));
    }



    private static ArrayList<Person> teamCreate(int val, int num) {
        ArrayList<Person> team = new ArrayList<>();
        int teamCount = 10;
        for (int i = 0; i < teamCount; i++) {

            switch (new Random().nextInt(4) + num) {
                case 0:
                    team.add(new Crossbowman(fillName(), 0, i));
                    break;
                case 1:
                    team.add(new Monk(fillName(), 0, i));
                    break;
                case 3:
                    team.add(new Peasant(fillName(), num * 3, i));
                    break;
                case 2:
                    team.add(new Pickman(fillName(), 0,i));
                    break;
                case 4:
                    team.add(new Sniper(fillName(), 9, i));
                    break;
                case 5:
                    team.add(new Wizard(fillName(), 9, i));
                    break;
                case 6:
                    team.add(new Robber(fillName(), 9, i));
                    break;

            }
        }
        return team;
    }

    //private void

    private static String fillName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }





}