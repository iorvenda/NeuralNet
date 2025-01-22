import java.util.ArrayList;
import java.util.Random;


public class print {
    public static void main(String[]args)
    {
           ArrayList<Double> data = new ArrayList<>();
           data.add(2.1);
           data.add(-1.1);
           data.add(1.1);
           data.add(9.1);
           data.add(0.1);
             NewNetwork n = new NewNetwork();
            ArrayList<Integer>list=new ArrayList<>();
            list.add(1);list.add(2);list.add(4);list.add(4);list.add(3);


           for (int i=0;i!=n.hiddenLayers(4,data).size();i++)
           {
              for(int j=0;j!=n.hiddenLayers(4,data).size();j++)
              {
                  System.out.println("Output:"+n.hiddenLayers(4,data).get(i).get(j).outPut+" Weights:"+
                          n.hiddenLayers(4,data).get(i).get(i).getWeight());
              }
           }
                n.result(n.hiddenLayers(4,data));


    }

}
