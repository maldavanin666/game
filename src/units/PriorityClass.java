package units;

import java.util.Comparator;

public class PriorityClass implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o2.prioritet, o1.prioritet);
    }
}
