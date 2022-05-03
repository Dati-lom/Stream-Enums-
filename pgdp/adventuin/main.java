package pgdp.adventuin;

import pgdp.color.RgbColor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {

        List<Adventuin> list = new LinkedList<>();




        Adventuin dato = new Adventuin("AdvenTux", 123, new RgbColor(3, 2, 7, 0), HatType.FISHY_HAT, Language.ENGLISH);
//        Adventuin rere = new Adventuin("AdvenTux", 123, new RgbColor(3, 2, 7, 0), HatType.FISHY_HAT, Language.ENGLISH);
//        Adventuin gela = new Adventuin("gela34343", 120, new RgbColor(3, 2, 7, 0), HatType.SANTA_CLAUS, Language.GERMAN);
//        Adventuin xixo = new Adventuin("gela34343", 124, new RgbColor(3, 2, 7, 0), HatType.SANTA_CLAUS, Language.GERMAN);
//        Adventuin s = new Adventuin("gela33", 123, new RgbColor(3, 2, 7, 0), HatType.SANTA_CLAUS, Language.GERMAN);
//        Adventuin zura = new Adventuin("zura", 127, new RgbColor(4, 1, 7, 0), HatType.REINDEER, Language.ENGLISH);
//        Adventuin a = new Adventuin("a33434", 100, new RgbColor(3, 2, 7, 0), HatType.REINDEER, Language.ENGLISH);
//        Adventuin b = new Adventuin("b2322", 129, new RgbColor(3, 2, 7, 0), HatType.FISHY_HAT, Language.ENGLISH);
//        Adventuin c = new Adventuin("c111", 130, new RgbColor(3, 2, 7, 0), HatType.REINDEER, Language.ENGLISH);
//        Adventuin d = new Adventuin("d34", 111, new RgbColor(3, 2, 7, 0), HatType.FISHY_HAT, Language.ENGLISH);

        list.add(dato);
//        list.add(gela); list.add(zura); list.add(a);list.add(b);list.add(c);list.add(d);list.add(rere);list.add(xixo);list.add(s);

//        System.out.println(dato.getLanguage().getLocalizedChristmasGreeting("dato"));


//        System.out.print(AdventuinParty.groupByHatType(list));



//    System.out.println(
//                AdventuinParty.getAdventuinsWithLongestNamesByHatType(list));
        System.out.println(AdventuinParty.getDiffOfAvgHeightDiffsToPredecessorByHatType(list));

//        System.out.println(AdventuinParty.getAverageColorBrightnessByHeight(list));



    }
}
