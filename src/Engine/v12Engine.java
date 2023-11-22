package Engine;

public class v12Engine extends Engine{
    public v12Engine() {
        super.name = "v12Engine";
    }
    @Override
    public void behaviour(String behave) {
        super.behaviour(name);
        System.out.println("Engine has " + name + "Behavior");
    }
}