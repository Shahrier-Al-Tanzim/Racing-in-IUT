package Engine;

public class v8Engine extends Engine{
    public v8Engine() {
        super.name = "v8";
    }
    @Override
    public void behaviour(String behave) {
        super.behaviour(name);
        System.out.println("Engine has " + name + "Behavior");
    }
}
