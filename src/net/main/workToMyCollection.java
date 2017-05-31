package net.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static javafx.scene.input.KeyCode.L;
import static javafx.scene.input.KeyCode.M;

/**
 * Created by asus on 29.05.17.
 */
public class workToMyCollection {


    public void sProgramm(){
        List<myFixedCollection> myList = new LinkedList<>();
        int idNum = 1;
        //заполняем коллекцию
        boolean controlExit  = false;
        mainMenu(2);
        int SIZE_USER_COLLECTION = 0;
        int pressEnterSizeCollection = 0;
        pressEnterSizeCollection = correctEnterToIntScanner(new Scanner(System.in),"");

        if (pressEnterSizeCollection == 1){
            SIZE_USER_COLLECTION = correctEnterToIntScanner(new Scanner(System.in),"");
        } else SIZE_USER_COLLECTION = 16;


        while (controlExit!=true) {

            mainMenu(1);
            switch (correctEnterToIntScanner(new Scanner(System.in),"Enter menu: ")) {
                case 1: {
                    Scanner in = new Scanner(System.in);
                    System.out.print("Enter First Name: ");
                    String firstName = in.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = in.nextLine();
                    System.out.print("Enter Street: ");
                    String street = in.nextLine();

                    if (myList.size()!=SIZE_USER_COLLECTION) {
                        myList.add(new myFixedCollection(idNum, new User(firstName, lastName, street)));
                        idNum++;
                    } else
                    {
                        myList.remove(0);
                        myList.add(new myFixedCollection(idNum, new User(firstName, lastName, street)));
                    }
                    controlExit  = false;
                    break;
                }
                case 2:{
                    System.out.println(myList);
                    controlExit  = false;
                    break;
                }
                case 0:{
                    controlExit  = true;
                    break;
                }
            }
        }
    }


    static int correctEnterToIntScanner(Scanner keyboard, String messageInput)
    {
        System.out.print(messageInput + " : ");
        while (!keyboard.hasNextInt())
        {
            System.err.println("You mast enter only integer value!!!");
            keyboard.next();
        }
        return keyboard.nextInt();
    }

    public void mainMenu(int outMenu){
        if (outMenu == 1) {
            System.out.println("");
            System.out.println("Menu:\n" +
                    "Enter nomber menu: \n" +
                    "1. Add elements for collection\n" +
                    "2. Print on display collection\n" +
                    "0. Exit from programm\n"
            );
        }else
        if (outMenu == 2){
            System.out.println("");
            System.out.println("If you wont to set the size colection pres enter 1\n" +
                    "or default press any key\n"
            );
        }
    }


}
