public class Cat extends Pets {
    public Cat(String name, String type) {
        super(name, type);
    }

    @Override
    public void petSpeak() {
        System.out.println(getName() + "Say Meeeoooowwww");
    }
}