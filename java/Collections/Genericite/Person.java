package Collections.Genericite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        // Comparaison basée sur l'âge
        return Integer.compare(this.age, otherPerson.age);
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        // Utilisation de compareTo pour comparer les personnes
        int result = person1.compareTo(person2);

        if (result < 0) {
            System.out.println(person1 + " est plus jeune que " + person2);
        } else if (result > 0) {
            System.out.println(person1 + " est plus âgée que " + person2);
        } else {
            System.out.println(person1 + " et " + person2 + " ont le même âge");
        }
    }
}


