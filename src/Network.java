import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
//MNIST database
//https://youtu.be/XxZ0BibMTjw?si=hHJmuRf-iNpB_UWy
// this should be something like the
public class Network
{

    // error function =  (predicted -actual)^2
    Random bias = new Random();
    Random random;
    double weight=0;
    ArrayList<Double>list;

    public Network()
    {

    }
    ArrayList<Double> calculatePerceptron(ArrayList<Double>data)// returns the sigma result  and save the weights
  {       double result=0;
      ArrayList<Double> list = new ArrayList<>();
           for(int i=0;i<data.size();i++)
           {
               random = new Random();
               result=data.get(i)*random.nextDouble(5)-1;
               list.add(result+bias.nextDouble(+2));
           }
           return list;
    }

   ArrayList<ArrayList<Double>> numOfLayers(int layers, ArrayList<Double> data)// run layers times creating the given number of hidden layers
     {
         ArrayList<ArrayList<Double>> hiddenLayers= new ArrayList<>();

         int count =data.size();
         double sigma=0;
         for (int i=0;i<layers;i++)
         {      list = new ArrayList<>();
                for(int j=0;j!=count;j++)
                {
                    sigma = squishFunction(calculatePerceptron(data));
                    list.add(sigma);
                }
             data = list;
             hiddenLayers.add(i,list);
         }
            return hiddenLayers;
     }
    public double squishFunction(ArrayList<Double> data)
    {double sum=0;
        for(int i=0;i<data.size();i++)
        {
           sum +=data.get(i);
        }
        return 1 / (1 + Math.exp(-sum));
    }
}
