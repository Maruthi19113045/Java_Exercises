package demo;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
        public static void main(String[] args) {
                try{
                        List arrlist = new ArrayList<String>();
                        arrlist.add("Kranthi");
                        arrlist.add("Sam");
                        arrlist.add("Raju");
                        arrlist.add("Kavin");
                        arrlist.add("Maruthi");
                        List arrlist2 = new ArrayList();
                        arrlist2.addAll(arrlist);
                        System.out.println("Second arraylist size: - " +arrlist2.size());
                        arrlist2.add("New Item Added");
                        System.out.println("Contents of second array list- " +arrlist2);
                        System.out.println("Second arraylist contains all? :" +arrlist2.containsAll(arrlist));


                        System.out.println(arrlist);
                        System.out.println(arrlist.size());
                        System.out.println((arrlist.contains("Maruthi"))? "true":"false");
                        arrlist.remove("Maruthi");
                        System.out.println(arrlist.size());
                        System.out.println((arrlist.contains("Maruthi"))? "true":"false");
                        System.out.println(arrlist.get(0));
                        //System.out.println(arrlist.get(8));
                        System.out.println("Demonstrating isEmpty(): " +arrlist.isEmpty());
                        arrlist.clear();
                        System.out.println("Post clearing the arrlist: " +arrlist.size());



                }catch(IndexOutOfBoundsException ie){
                        System.out.println("IndexOutOfBound" +ie.getMessage());
                }
                System.out.println("Executed Successfully!");




        }
}
