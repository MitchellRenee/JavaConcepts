/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationControllerPatternwithhashmap;

/**
 * References: https://docs.google.com/presentation/d/1sueAytWxvCCUt4b63D8obRb0AvVw6YTLPGykYg6Oo48/edit#slide=id.p1
 * @author Renee
 * @param 
 * @param 
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class ApplicationControllerPat {


    public void test() {

        /*Declare a HashMap*/
        HashMap<Integer, String> hmap = new HashMap<>();

        /*Add elements for the HashMap*/
        hmap.put(1, "Kirk Brown");
        hmap.put(2, "Paul Darr");
        hmap.put(3, "Edward Wilson");
        hmap.put(4, "Mason Roller");
        hmap.put(5, "Renee Mitchell");

        /*Display output using an Iterator*/
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        int i = 0;
        Iterator<Map.Entry<Integer, String>> it = hmap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> pair = it.next();
            /*a += pair.getKey() + pair.(); */
            System.out.println(pair.getKey() + pair.getValue());
        }
    }

    /*Add function*/
    public static void main(String args[]) {
        ApplicationControllerPat controller = new ApplicationControllerPat();
        controller.test();

    }
}
