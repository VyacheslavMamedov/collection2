package net.main;

import org.omg.PortableInterceptor.USER_EXCEPTION;

import javax.jws.soap.SOAPBinding;
import java.util.*;

public class workToMyCollection {

   private int SIZE_USER_COLLECTION = 0;
   private int mySize = 0;

    public void sProgramm(){

        final int[] tempIndex = {0};
        Map<Integer, User> myList = new HashMap<Integer, User>(){

            @Override
            public User put(Integer key, User value) {

                if (mySize == SIZE_USER_COLLECTION) System.err.println("Collection fool");//

                if (mySize > SIZE_USER_COLLECTION) {
                    HashMap.Entry<Integer, User> firstElementIntoMyMap =
                            (Entry<Integer, User>) super.entrySet().iterator().next();

                    Integer firstId = firstElementIntoMyMap.getKey();

                    super.remove(firstId);//delete the first elements

                    return super.put(key, value);//add elements on lasp position

                } else {
                    System.out.println("Add " + mySize + " elements in collection");
                    return super.put(key, value);
                }
            //    return value;
            }
        };

        int idNum = 1;

        //заполняем коллекцию
        boolean controlExit  = false;
        mainMenu(2);

        int pressEnterSizeCollection = 0;
        pressEnterSizeCollection = correctEnterToIntScanner(new Scanner(System.in),"Enter nomber");

        if (pressEnterSizeCollection == 1){
            SIZE_USER_COLLECTION = correctEnterToIntScanner(new Scanner(System.in),"Enter size collection");
        } else SIZE_USER_COLLECTION = 16;



        while (controlExit!=true) {

            mainMenu(1);
            switch (correctEnterToIntScanner(new Scanner(System.in),"Enter menu: ")) {
                case 1: {
                    mySize=idNum;
                    System.out.print("Enter First name: ");
                    Scanner in = new Scanner(System.in);
                    String firstName = in.next();

                    System.out.print("Enter last name: ");
                    String lastName = in.next();

                    System.out.print("Enter phone: ");
                    String phone = in.next();

                    myList.put(idNum,new User(firstName,lastName,phone));

                    ++idNum;
                    controlExit  = false;
                    break;
                }
                case 2:{
                    for (Map.Entry entry : myList.entrySet()) {
                        System.out.println("id: "+entry.getKey() + " : "
                                + entry.getValue());
                    }
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
