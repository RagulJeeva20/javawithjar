package org.example;

import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Treeset {
    public static void treeset() {
        Logger l=Logger.getLogger("tyler");

        TreeSet<String> ts = new TreeSet<>();
        l.log(Level.INFO,() -> String.valueOf(ts.add("apple")));
        ts.add("grape");
        ts.add("jackfruit");
        ts.add("pineapple");
        ts.remove("apple");
        l.log(Level.INFO,() -> String.valueOf(ts));
        l.log(Level.INFO,() -> String.valueOf(ts.size()));



    }
}