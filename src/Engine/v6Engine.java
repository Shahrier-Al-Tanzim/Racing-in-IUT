package Engine;

public class v6Engine extends Engine{
    public v6Engine() {
        super.name = "v6Engine";
    }
    @Override
    public void behaviour(String name) {
        super.behaviour(name);
        System.out.println("Engine has " + name + "Behavior");
    }
}