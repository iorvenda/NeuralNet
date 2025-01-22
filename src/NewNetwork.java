import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class NewNetwork
{
    ArrayList<Neuron> calcuate(ArrayList<Double> data)
    {
       Random weights_random = new Random();
       Random bias_random = new Random();
       Neuron neuron;
       ArrayList<Neuron>listOfNeurons= new ArrayList<>();
       ArrayList<Double> neuron_weights;
       Double weights;

       for(int i=0;i!= data.size();i++)
       {   double result=0;
           neuron_weights = new ArrayList<>();
           neuron = new Neuron();
           for(int j=0;j!= data.size();j++)
           {
               weights =weights_random.nextDouble(2)-1;
               result += (data.get(i)*weights+ bias_random.nextDouble(3)-1);
               neuron_weights.add(weights);

           }
           neuron.setWeight(neuron_weights);
           neuron.setOutPut(squishFunction(result));
           listOfNeurons.add(neuron);
       }

        return listOfNeurons;
    }
    public double squishFunction(double data)
    {
        return 1 / (1 + Math.exp(-data));
    }
    public ArrayList<ArrayList<Neuron>> hiddenLayers(int numberOfLayers,ArrayList<Double> data)
    {ArrayList<ArrayList<Neuron>> hiddenLayers= new ArrayList<>();

        ArrayList<Neuron>newData=new ArrayList<>();

            for(int j =0; j!=numberOfLayers;j++)
            {
                newData=calcuate(data);
                hiddenLayers.add(j,newData);
                data=newData.get(0).weight;

            }



        return hiddenLayers;
    }
    public double result(ArrayList<ArrayList<Neuron>> hiddenLayers)
    {
        double output=0;
        for(int j =0; j!=hiddenLayers.size();j++)
        {
            for(int i=0;i!=hiddenLayers.size();i++)
            {
                System.out.println(hiddenLayers.get(j).get(i).outPut);
            }
        }
        return output;
    }


}
