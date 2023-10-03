public class Cat extends Pets{
    public Cat(String name, String type) {
        super(name, type);
    }

    @Override
    public void petSpeak(String speak) {
        super.petSpeak(getName() + "Say Meeeoooowwww");
    }
}
