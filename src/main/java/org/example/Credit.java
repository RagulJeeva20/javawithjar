package org.example;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Credit implements Cloneable
{
    Logger l=Logger.getLogger("tyler");

    Integer cardno;
    String name;
    Integer date;

    Integer cardnum;

    Credit(Integer a)
    {
        name="ragul";
        cardno=1234;
        date=2025;
        this.cardnum=a;

    }
    boolean eq()
    {
        return (cardno.equals(cardnum));
    }
    void show()
    {
        l.log(Level.INFO, () ->"your name:" + name);
        l.log(Level.INFO, () ->"your card number:"+ cardnum);
        l.log(Level.INFO, () ->"expiry date:"+date);
    }
    Credit cr()
    {
        try
        {
            return (Credit) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            l.info("cloned");
            return this;
        }
    }
    public static void credit1()
    {
        Scanner s=new Scanner(System.in);
        Logger l=Logger.getLogger("tyler");
        l.info("enter the card num:");
        Integer a=s.nextInt();
        Credit r=new Credit(a);
        Credit m= r.cr();
        m.eq();
        if(m.eq())
        {
            l.info("credit card num is same");
        }
        else {
            l.info("credit card num is not same");
        }
        m.show();

    }
}