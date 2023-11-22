package Factory;

import Engine.*;

public class EngineFactory {
    public static Engine getEngine(String name){
        if(name.equals("v6")){
            return new v6Engine();
        }
        else if (name.equals("v8")){
            return new v8Engine();
        }
        else if (name.equals("v12")){
            return new v12Engine();
        }
        else{
            return null;
        }
    }
}
