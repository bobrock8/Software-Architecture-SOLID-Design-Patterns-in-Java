package designpatterns.creationaldesignpatterns.builderpattern;

public class BuilderPattern {

    public BuilderPattern() {
        Person person = new Person.Builder("Aleksandar", "aleksandarilic990@gmail.com").build();
        Person person2 = new Person.Builder("Aleksandar", "aleksandarilic990@gmail.com").setAddress("Trg 14. Oktobar").setAge(30).build();
        System.out.println(person);
        System.out.println(person2);
    }
}
