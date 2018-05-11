/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationControllerPatternwithhashmap ;
/**
 *
 * @author Renee
     * @param args
     * @param i
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Handler;
public class ApplicationControllerPat {
    private static final HashMap<String, Handler> handlerMap = new HashMap();
    
    public void handleCommand(String command, HashMap<String, Object> data){
        Handler CommandHandler = handlerMap.get(command);
        if (CommandHandler != null){
            CommandHandler.getClass();
        }
    }
    
    public void mapCommand(String Command, Handler CommandHandler){
        handlerMap.putIfAbsent(Command, CommandHandler);
    }


    
    /*Declare a HashMap*/
    HashMap<Integer,String> hmap = new HashMap<>();{
    
    /*Add elements for the HashMap*/
    hmap.put(1,"Kirk Brown");
    hmap.put(2,"Paul Darr");
    hmap.put(3,"Edward Wilson");
    hmap.put(4,"Mason Roller");
    hmap.put(5,"Renee Mitchell");

    /*Display output using an Iterator*/
    Set set = hmap.entrySet();
    Iterator iterator = set.iterator();
        int i = 0;
        Iterator<Map.Entry<Integer, String>> it = hmap.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry <Integer, String> pair = it.next();
            /*a += pair.getKey() + pair.(); */       
         System.out.println(pair.getKey() + pair.getValue());
                 
    
        }
        
    }
        /*Add function*/
        public static void main(String args[]){    
}

}
