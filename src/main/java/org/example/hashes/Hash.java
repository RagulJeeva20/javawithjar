package org.example.hashes;




        import java.util.InputMismatchException;
        import java.util.Scanner;
        import java.util.logging.Logger;

public class Hash {
    private Hash(){}
    public static void hash1(){

        Logger l = Logger.getLogger("kawin");
        int choice;
        Scanner scanin = new Scanner(System.in);
        boolean cond = true;
        while (cond) {
            l.info("1 Hashmap\n2 Hashset\n3Treeset\n4 exit");
            try {
                choice = scanin.nextInt();


                switch (choice) {
                    case 1:
                        Hashmap.hashmap();
                        break;
                    case 2:
                        Hashset.hashset();
                        break;
                    case 3:
                        Treeset.treeset();
                        break;
                    case 4:
                        cond = false;
                        break;

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
