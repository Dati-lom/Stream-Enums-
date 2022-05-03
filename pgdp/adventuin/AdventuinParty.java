package pgdp.adventuin;
import java.util.*;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import com.sun.source.doctree.SummaryTree;
import pgdp.color.RgbColor;
import pgdp.color.RgbColor8Bit;

public final class AdventuinParty {
    private final List<Adventuin> adventuins;

    public AdventuinParty(List<Adventuin> adventuins) {
        this.adventuins = adventuins;
    }





    static public Map<HatType, List<Adventuin>> groupByHatType(List<Adventuin> adventuins) {


            return adventuins.stream().collect(Collectors.groupingBy(Adventuin::getHatType));
//


    }



   static public void printLocalizedChristmasGreetings(List<Adventuin> adventuins){

        if(adventuins != null) {
           adventuins.stream().sorted(Comparator.comparing(Adventuin::getHeight)).forEach(adventuin -> System.out.println(adventuin.getLanguage().getLocalizedChristmasGreeting(adventuin.getName()) ));
//            sortedlist.forEach(System.out::println);
        }

      }



      static public Map<HatType,List<Adventuin>> getAdventuinsWithLongestNamesByHatType(List<Adventuin> adventuins) {
        //i tried in many ways but this seems to work

        Map<HatType,List<Adventuin>> m1 = adventuins.stream().collect(Collectors.groupingBy(Adventuin::getHatType));

          Map<HatType,List<Adventuin>> m2 = new HashMap<>();

          for(HatType key:m1.keySet()){
              int p1 =0;

              for(int i = 0; i < m1.get(key).size(); i++){

                  if(m1.get(key) == null){m2.put(key,m1.get(key));}
                  if(m1.get(key).get(i).getName().length() > p1){
                      p1 = m1.get(key).get(i).getName().length();
                  }

              }
              int finalP = p1;
              m1.get(key).removeIf(adventuin -> adventuin.getName().length() != finalP);
              m2.put(key, m1.get(key));

          }


                              return m2;
      }







      static public Map<Integer, Double> getAverageColorBrightnessByHeight(List<Adventuin> adventuins){


          Map<Integer, List<Double>> m3 = new HashMap<>();

        adventuins.forEach(p -> {
            Integer d = 0;
            d = Math.round((p.getHeight()+5)/10)*10;

            List<Double> temp3 = m3.get(Math.round((p.getHeight()+5)/10)*10);
            RgbColor8Bit y = p.getColor().toRgbColor8Bit();
            Double m = (0.2126* y.getRed() + 0.7152* y.getGreen()+ 0.0722* y.getBlue())/255;

            if(temp3 == null){

                temp3 = new LinkedList<>();
            }
            temp3.add(m);

            m3.put(d, temp3);
        });

        Map<Integer, Double> m4 = new HashMap<>();


        for(Integer key : m3.keySet()){
            Double avg = m3.get(key).stream().mapToDouble(a->a).average().getAsDouble();

            m4.put(key,avg);
        }


//          OptionalDouble av = val.stream().mapToDouble(a->a).average();

        return m4;

      }


      static public Map<HatType,Double>  getDiffOfAvgHeightDiffsToPredecessorByHatType(List<Adventuin> adventuins){

          Map<HatType,List<Adventuin>> m1 = groupByHatType(adventuins);

          Map<HatType, Double> m2 = new HashMap<>();


          for(HatType key:m1.keySet()){

              List<Integer> n = new LinkedList<>();

              for(int i = 0; i < m1.get(key).size(); i++){
                  Integer d = m1.get(key).get(i).getHeight();
                  n.add(d);
              }

              Integer[] r = new Integer[n.size()];
              List<Integer> negat = new LinkedList();
              List<Integer> posit = new LinkedList();


              n.toArray(r);

              for(int i = 0; i <r.length;i++){
                  int pl = 0;
                  if(i == r.length -1){
                      pl = r[i] - r[0];
                      if(pl < 0){negat.add(pl);}
                      if(pl > 0){posit.add(pl);}

                  }else{
                      pl = r[i] - r[i+1];
                      if(pl > 0){posit.add(pl);}
                      if(pl < 0){negat.add(pl);}

                  }
              }
              Double ps = 0.0;
              Double pl = 0.0;
              try {
                   ps = posit.stream().mapToDouble(a -> a).average().getAsDouble();
              }catch(NoSuchElementException e){e.printStackTrace();}

              try{
               pl =negat.stream().mapToDouble(a->a).average().getAsDouble();
              }catch(NoSuchElementException e){e.printStackTrace();}

              Double ss = ps - pl;

              m2.put(key,ss);

          }



        return m2;

      }


    @Override
    public String toString() {
        return "AdventuinParty{" +
                "adventuins=" + adventuins +
                '}';
    }
}

 //TODO
