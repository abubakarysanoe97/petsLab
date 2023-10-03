public class Lion extends Pets{
    public Lion(String name, String type) {
        super(name, type);

    }

    @Override
    public void petSpeak() {
        System.out.println(getName() + "Says Roooooooaaarrrrrr");
    }
}
