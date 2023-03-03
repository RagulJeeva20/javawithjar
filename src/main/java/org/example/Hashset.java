package org.example;

import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hashset {
    public static void hashset() {
        Logger l=Logger.getLogger("tyler");
        HashSet<String> hs = new HashSet<>();
        hs.add("rohit");
        hs.add("virat");
        hs.add("yuvi");
        hs.add("yuvi");
        l.log(Level.INFO,() -> String.valueOf(hs));
        hs.remove("virat");
        l.log(Level.INFO,() -> "After invoking remove method: "+hs);
        l.log(Level.INFO,() -> "Size: "+hs.size());
        hs.clone();
        l.log(Level.INFO,() -> "cloned hash set:"+hs);
    }
}
