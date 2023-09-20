import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Martin", "0767288383", 20);
        Person p2 = new Person("Louis", "076383", 30);
        Person p3 = p1;   // fortfarande bara 2 personer, skapas bara om man skriver new person

        System.out.println(p3.name);
        p1.name = "Susan";
        System.out.println(p1.name);
        System.out.println(p3.name);

        Person p4 = new Person();
        System.out.println(p4.name);   //   blir --


        p1.greet();

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(p1);
        persons.add(p2);
        persons.add(p3); // samma objekt som p1, så läggs in 2 gånger
        persons.add(p4);

        // for each utmärkt för att loopa genom en lista
        for(Person person : persons) {
            //  System.out.println(person.name);
            //  person.greet();
            // System.out.println(person.toString());  // behöver inte skriva toString utan kommer automatiskt försöka hitta en sån funktion
            System.out.println(person);
        }
    }
}