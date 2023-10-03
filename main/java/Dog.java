public class Dog extends Pets {

    public Dog(String name, String type) {
        super(name, type);
    }

    @Override
    public void petSpeak() {
        System.out.println(getName() + " Says Wooffffffffffffffff");
    }

}
