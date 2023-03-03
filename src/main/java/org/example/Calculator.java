package org.example;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Calculator
{
    private Calculator(){}

    public static void calc1()
    {
        Logger l = Logger.getLogger("tyler");
        Scanner s = new Scanner(System.in);
        l.info("Enter the num1:");
        int a = s.nextInt();
        l.info("Enter the num2:");
        int b = s.nextInt();
        l.info("1.Addition");
        l.info("2.Subtraction");
        l.info("3.Multiplication");
        l.info("4.Division");
        l.info("Enter a choice");
        int sel = s.nextInt();
        switch (sel) {
            case 1:
                Addition ad = new Addition();
                ad.toset(a, b);
                l.log(Level.INFO, () -> "Addition of 2 numbers is:" + ad.cal(ad.toget1(), ad.toget2()));
                break;
            case 2:
                Subraction su = new Subraction();
                su.toset(a, b);
                l.log(Level.INFO, () -> "Subtraction of 2 numbers is:" + su.cal(su.toget1(), su.toget2()));
                break;
            case 3:
                Multi m = new Multi();
                m.toset(a, b);
                l.log(Level.INFO, () -> "Multiplication of 2 numbers is:" + m.cal(m.toget1(), m.toget2()));
                break;
            case 4:
                try
                {
                    Division d = new Division();
                    d.toset(a, b);
                    l.log(Level.INFO, () -> "Multiplication of 2 numbers is:" + d.cal(d.toget1(), d.toget2()));
                }
                catch (ArithmeticException e)
                {
                    l.info("can't divide..there is an arithmetic error");
                }

                break;

            default:
                l.info("Invalid Input");
                break;
        }
    }
}