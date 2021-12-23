import sun.reflect.generics.tree.Tree;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Person p1 = new Person(30);
        Person p2 = new Person(31);
        Person p3 = new Person(32);
        Person p4 = new Person(33);

        TreeSet<Person> persons = new TreeSet<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);

        for(Person p :persons){
            System.out.println(p);
        }
    }


}
class Person implements Comparable<Person>{
    int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person p) {//p1.compareTo(p2);
//       此处的this是p1
//        p是p2
        return this.age - p.age;
    }
}
