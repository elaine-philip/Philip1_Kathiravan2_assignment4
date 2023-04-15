package datastr.a4;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Random;

public class Driver {
    public static void main(String[] args) {
        int counter = 0;
        double sum = 0;
        double average = 0;
        System.out.print("Enter input size: ");
        Scanner scanSize = new Scanner(System.in);
        int count = scanSize.nextInt();
        int[] inputs = new int[count];

        Sorting list = new Sorting();


        System.out.print("Enter sort type: ");
        Scanner scanType = new Scanner(System.in);
        String command  = scanSize.next();
             if (command.equals("s")) {
                 counter = 0;
                 while (counter < 10) {
                     for (int i = 0; i < count; i++) {
                         int randomNum = (int)(Math.random() * 101);
                         inputs[i]  = randomNum;
                     } // for

                     list.resetNumComp();
                     list.SelectionSort(inputs, count);
                     sum = sum + list.getNumComp();
                     counter ++;
                 } // while
                 System.out.println();
                 average = sum / 10;
                 System.out.println("#Selection-sort comparisons: " + average);
             }   else if (command.equals("m")) {
                 counter = 0;
                 while (counter < 10) {
                     for (int i = 0; i < count; i++) {
                         int randomNum = (int)(Math.random() * 101);
                         inputs[i]  = randomNum;
                     } // for

                     list.resetNumComp();
                     list.mergeSort(inputs, count);
                     sum = sum + list.getNumComp();
                     counter ++;
                 } // while
                 System.out.println();
                 average = sum / 10;
                 System.out.println("#Merge-sort comparisons: " + average);
                 } // if

             System.exit(0);

   } // main
} // LinkedListDriver

/**
                 list.mergeSort(inputs, count);
                 average = list.getNumComp();
                 System.out.println("#Merge-sort comparisons: " + average);
*/
