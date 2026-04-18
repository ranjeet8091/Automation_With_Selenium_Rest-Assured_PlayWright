package comparator;

import java.util.Comparator;

class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;   // ascending order
    }
}

