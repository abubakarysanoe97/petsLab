public class Dog extends Pets {

    public Dog(String name, String type) {
        super(name, type);
    }

    @Override
    public void petSpeak(String speak) {
        System.out.println(getName() + " Says Wooffffffffffffffff");
    }
}
