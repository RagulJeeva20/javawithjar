package org.example;

import java.util.logging.Logger;


abstract class Calci
{
    Logger l = Logger.getLogger("tyler");

    private int a;
    private int b;
    public void toset(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public int toget1()
    {
        return a;
    }
    public int toget2()
    {
        return b;
    }
    abstract int cal(int a, int b);

}