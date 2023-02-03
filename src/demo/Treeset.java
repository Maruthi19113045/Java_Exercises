package demo;

import java.util.*;
public class Treeset {
    public static void main(String args[]){
        TreeSet<String> set=new TreeSet<String>();
        set.add("Anil");
        set.add("Bhuvi");
        set.add("Charn");
        set.add("Delli");
        set.add("England");
        System.out.println("Initial Set: "+set);

        System.out.println("Reverse Set: "+set.descendingSet());

        System.out.println("Head Set: "+set.headSet("Charn", true));

        System.out.println("SubSet: "+set.subSet("Anil", false, "England", true));

        System.out.println("TailSet: "+set.tailSet("Charn", false));
    }
}
