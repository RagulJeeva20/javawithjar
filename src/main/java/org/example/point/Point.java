package org.example.point;

import java.util.Scanner;
import java.util.logging.*;
public class Point
{
    Logger l=Logger.getLogger("tyler");
    Integer x;
    Integer y;

    Point(Integer a,Integer b)
    {
        this.x=a;
        this.y=b;
    }
    boolean eq()
    {
        return x.equals(y);

    }

    Point pt()
    {
        try
        {
            return (Point) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            l.info("clone error");
            return this;
        }
    }

    public static void point1()
    {
        Scanner s=new Scanner(System.in);
        Logger l=Logger.getLogger("tyler");
        l.info("Enter x corodinate:");
        Integer p=s.nextInt();
        l.info("Enter y corodinate:");
        Integer q=s.nextInt();
        Point r =new Point(p,q);
        Point m=r.pt();
        if(m.eq())
        {
            l.info("x and y are same");
        }
        else {
            l.info("x and y are not same");
        }


    }

}
