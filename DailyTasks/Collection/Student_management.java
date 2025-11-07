
//Student management using arraylist

package Collection;

import java.util.*;

class Student {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class Student_management {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("John", 1));
        list.add(new Student("Rahul", 2));

        for (Student s : list) {
            System.out.println("ID: " + s.id + ", Name: " + s.name);
        }
    }
}
