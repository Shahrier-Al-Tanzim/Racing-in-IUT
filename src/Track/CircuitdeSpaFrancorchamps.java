package Track;

public class CircuitdeSpaFrancorchamps extends Track{
    public CircuitdeSpaFrancorchamps(String type){
        this.name = "Circuit de Spa Francorchamps";
        this.location = "Germany";
        this.type = type;
        System.out.println("Adding Circuit de Spa Francorchamps, Germany " + type + " Race Track");
    }
}
