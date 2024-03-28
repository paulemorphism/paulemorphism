package morphism.paule;

public class Main {
    public static void main(String[] args) {
        var paulemorphism = new Programmer();
        paulemorphism.setName("Paul E. Morphism");
        System.out.println(paulemorphism.getName());
    }
}

abstract class Person {

}

interface Nameable {
    String getName();
}

class Programmer extends Person implements Nameable {
    String name;

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
