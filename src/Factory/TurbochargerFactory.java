package Factory;

import Turbocharger.*;

public class TurbochargerFactory {
    public static Turbocharger getTurbocharger(String name){
        if(name.equals("Alpine")){
            return new Alpine();
        }
        else if (name.equals("Cummins")){
            return new Cummins();
        }
        else if (name.equals("Honeywell")){
            return new Honeywell();
        }
        else{
            return null;
        }
    }
}
