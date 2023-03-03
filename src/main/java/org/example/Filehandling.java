package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Filehandling {
    private Filehandling(){}
    public static void file1()
    {
        Logger l = Logger.getLogger("tyler");
        StringBuilder string=new StringBuilder();
        try
        {
            String p="C:\\Users\\Tringapps-User22\\Documents\\jav.txt";
            File textfile = new File(p);
            Scanner sc = new Scanner(textfile);
            while (sc.hasNext())
            {
                string.append(sc.nextLine());
                string.append(" ");
            }
        }
        catch (FileNotFoundException e)
        {

            String s = "No file found" + e;
            l.info(s);
        }
        String[] strarray=string.toString().split( " ");
        HashMap<String,Integer>  hm=new HashMap<>();
        for (int i = 0; i <strarray.length; i++)
        {
            if (hm.containsKey(strarray[i]))
            {
                hm.put(strarray[i],hm.get(strarray[i])+1);
            }
            else
            {
                hm.put(strarray[i],1);
            }
        }
        PriorityQueue<Map.Entry<String ,Integer>> pq=new PriorityQueue<>((a,b)-> b.getValue() - a.getValue());
        pq.addAll(hm.entrySet());
        while (!pq.isEmpty())
        {
            l.log(Level.INFO, ()-> "\n"+ pq.poll());
        }

    }
}
