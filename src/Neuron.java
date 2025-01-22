import java.util.ArrayList;
import java.util.Arrays;

public class Neuron
{


    ArrayList<Double> weight;
    Double outPut;
    Neuron()
    {

    }
    public Double getOutPut() {
        return outPut;
    }

    public void setOutPut(Double outPut) {
        this.outPut = outPut;
    }

    public ArrayList<Double> getWeight() {
        return weight;
    }

    public void setWeight(ArrayList<Double> weight) {
        this.weight = weight;
    }



}
