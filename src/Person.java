public class Person {    // klass är en mall av ett objekt
    String name;     //instansvarialerb
    String phoneNumber;
    int age;

    // kan ha flera konstruktor för en klass
    public Person(){
        this.name = "--";          // om man inte skickar med något värde, då sätter man den till --
        this.phoneNumber = "--";
        this.age = 0;
    }


    public Person(String name, String phoneNumber, int age) {   // konstruktor
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public void greet() {  //metoder, det ett objekt kan göra
        System.out.println("Hej, jag heter " + this.name);
    }

    // praktiskt att ha en funktion som kan skriva ut ett objekt enklare
    public String toString() {
        return "Name: " +this.name +
                " Phone: " + this.phoneNumber +
                " Age: " + this.age;
    }


}
