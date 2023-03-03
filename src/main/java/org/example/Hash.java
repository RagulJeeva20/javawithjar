package org.example;




        import java.util.InputMismatchException;
        import java.util.Scanner;
        import java.util.logging.Logger;

public class Hash {
    public static void hash1(){

        Logger l = Logger.getLogger("kawin");
        int choice;
        Scanner scanin = new Scanner(System.in);
        boolean cond = true;
        while (cond==true) {
            l.info("1 Hashmap\n2 Hashset\n3Treeset\n4 exit");
            try {


                choice = scanin.nextInt();


                switch (choice) {
                    case 1:
                        Hashmap obj = new Hashmap();
                        obj.hashmap();
                        break;
                    case 2:
                        Hashset obj1 = new Hashset();
                        obj1.hashset();
                        break;
                    case 3:
                        Treeset obj2 = new Treeset();
                        obj2.treeset();
                        break;
                    case 4:
                        cond = false;

                    default:
                        l.info("Invalid option");

                }
                l.info("If You want to discontinue press->2 or to continue press any number?");
                int cont = scanin.nextInt();
                if (cont == 2)
                {
                    l.info("Hash closed");
                    cond = false;
                }
            }
            catch (InputMismatchException e)
            {
                l.info("YOU HAVE ENTERED WRONG DATA TYPE!");
            }
        }
    }
}
