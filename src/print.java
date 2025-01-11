import java.util.ArrayList;
import java.util.Random;


public class print {
    public static void main(String[]args)
    {
           ArrayList<Double> data = new ArrayList<>();
        data.add(2.1);data.add(-1.1);data.add(1.1);data.add(9.1);data.add(0.1);
             NewNetwork n = new NewNetwork();


           for (int i=0;i!=n.hiddenLayers(4,data).size();i++)
           {
               System.out.println("Output:"+n.hiddenLayers(4,data).get(i).get(i).outPut+" Weights:"+
                       n.hiddenLayers(4,data).get(i).get(i).getWeight());
           }



    }

}
