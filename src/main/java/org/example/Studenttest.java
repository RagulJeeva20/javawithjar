package org.example;

import java.util.*;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

class Studenttest
{
    private Studenttest(){}
    public static void stutest1()
    {
        Logger l=Logger.getLogger("tyler");



        List <Stulist> list=new ArrayList<Stulist>();
        Scanner sc=new Scanner(System.in);
        Scanner scaned=new Scanner(System.in);
        l.info("enter the number of students");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            l.info("Enter the student name");
            String name = scaned.next();

            l.info("Enter the student age");
            int age = sc.nextInt();

            l.info("Enter the student gpa");
            int gpa = sc.nextInt();

            Stulist s = new Stulist(name, age, gpa);
            list.add(s);

            l.log(Level.INFO, () -> "Name :" + s.getname());
            l.log(Level.INFO, () -> "age  :" + s.getage());
            l.log(Level.INFO, () -> "gpa :" + s.getgpa());
        }

        l.info("list of students after sorting:");

        Collections.sort(list, new Comparator <Stulist>()
        {

            public int compare(Stulist o1, Stulist o2)
            {
                if (o1.getgpa() < o2.getgpa())
                {
                    return 1;
                }
                else if (o1.getgpa()==o2.getgpa())
                {
                    return 0;
                }
                else
                {
                    return -1;
                }
            }
        });
        for (int i = 0; i <n ; i++)
        {
            int i1=i;
            l.log(Level.INFO, () ->list.get(i1).getname() + " " + list.get(i1).getage() + " " + list.get(i1).getgpa() + " ");
        }

    }
}