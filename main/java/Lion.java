public class Lion extends Pets{
    public Lion(String name, String type) {
        super(name, type);

    }

    @Override
    public void petSpeak(String speak) {
        super.petSpeak(getName() + "Says Roooooooaaarrrrrr");
    }
}
