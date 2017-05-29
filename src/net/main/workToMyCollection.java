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

        int MAX_SIZE_COLLECTION = 16;

    public void sProgramm(){
        List<myFixedCollection> myList = new LinkedList<>();
        int idNum = 1;
        //заполняем коллекцию
        while (myList.size()<MAX_SIZE_COLLECTION){
            myList.add(new myFixedCollection(idNum, new User("Ivanov" + Integer.valueOf(idNum),
                    "Vasya"+ Integer.valueOf(idNum),"Gorkogo 22"+ Integer.valueOf(idNum))));
            idNum++;
        }
        //System.out.println(myList+"\n");

        //удаляем первый и добавляем в конец
        if (myList.size()==MAX_SIZE_COLLECTION){
            myList.remove(0);
            myList.add(new myFixedCollection(idNum, new User("Petrov",
                    "Kolya","Gorkogo 32")));
        }
        System.out.println(myList);
            System.out.println(myList.size());

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


}
