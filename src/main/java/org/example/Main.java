package org.example;


import org.example.bank.Bankacc;
import org.example.calculator.Calculator;
import org.example.contact.Contact;
import org.example.credit.Credit;
import org.example.database.Creation;
import org.example.filehandling.Filehandling;
import org.example.hashes.Hash;
import org.example.point.Point;
import org.example.shapes.Shapes;
import org.example.student.Students;
import org.example.studenttest.Studenttest;
import org.example.tictactoe.Tictac;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        Logger log = Logger.getLogger("tyler");
        int choice;
        do {
            log.info("1.BankAccount\n2.Shape\n3.Student\n4.Database\n5.Point\n6.CreditCard\n7.StudentList\n8.Calculator\n9.File Handling(frequency)\n10.Contacts\n11.Hashes and Treesets\n12.Tictac\n13.Exit");
            log.info("Enter your choice:");
            choice = scan.nextInt();
            switch (choice)
            {
                case 1: Bankacc ragul = new Bankacc();
                    ragul.deposit();
                    break;
                case 2:
                    Shapes a1=new Shapes();
                    a1.perimeter();
                    a1.areas();
                    break;
                case 3:
                    Students ragulj=new Students();
                    ragulj.show();
                    break;
                case 4:
                    Creation.database();
                    break;
                case 5:
                    Point.point1();
                    break;
                case 6:
                    Credit.credit1();
                    break;
                case 7:
                    Studenttest.stutest1();
                    break;
                case 8:
                    Calculator.calc1();
                    break;
                case 9:
                    Filehandling.file1();
                    break;
                case 10:
                    Contact.contact1();
                    break;
                case 11:
                    Hash.hash1();
                    break;
                case 12:
                    Tictac.tictac();
                    break;
                case 13:
                    System.exit(0);
                    break;
                default:
                    log.info("Invalid choice Number!");
            }
        } while (choice !=13);
    }
}