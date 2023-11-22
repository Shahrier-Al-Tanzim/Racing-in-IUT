package Factory;

import Track.*;

public class TrackFactory {
    public static Track createTrack (String location, String type){
        if(location.equals("Germany")){
            return new CircuitdeSpaFrancorchamps(type);
        }
        else if(location.equals("Japan")){
            return new BlueMoonBaySpeedway(type);
        }
        else if(location.equals("USA"))
        {
            return new BBRaceway(type);
        }
        else{
            return null;
        }
    }
}
