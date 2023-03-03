package org.example;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hashmap
{
    public static void hashmap()
    {


        HashMap<Integer, String> map = new HashMap<>();
        Logger l=Logger.getLogger("tyler");
        map.put(1,"ironman");
        map.put(2,"cap");
        map.put(3,"thor");
        map.put(4,"ironman");
        l.log(Level.INFO,() -> String.valueOf(map));
        l.log(Level.INFO,() ->map.remove(2));
        l.log(Level.INFO,() -> String.valueOf(map));
        map.replace(3,"thor","spidy");
        l.log(Level.INFO,() -> String.valueOf(map));
        map.clear();
        l.log(Level.INFO,() -> String.valueOf(map));
    }

}
