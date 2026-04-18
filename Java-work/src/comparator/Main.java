package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1, "Ranjeet", 22));
        list.add(new Student(2, "Vibhor", 18));
        list.add(new Student(3, "Ankur", 25));

        Collections.sort(list, new AgeComparator());

        for(Student s : list) {
            System.out.println(s);
        }
    }
}
