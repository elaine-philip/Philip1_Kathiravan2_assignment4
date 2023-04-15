package datastr.a4;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class SortedDriver {
    public static void main(String[] args) {
        try {

            System.out.println("selection-sort (s) merge-sort (m) heap-sort (h) quick-sort-fp (q) "
            + "quick-sort-rp (r)");
            Scanner scanType = new Scanner(System.in);

            File fileName = new File(args[0]);
            Scanner scan = new Scanner(fileName);

            Sorting list = new Sorting();

            int count = 0;
            int[] inputs = new int[10000];

            while(scan.hasNextInt()) {
                int itemInt = scan.nextInt();
                inputs[count] = itemInt;
                count++;
            } // while
            // creates input int array

            String command = "";
            System.out.print("Enter the algorithm: ");
            // prompts user

            Scanner scanCom  = new Scanner(System.in);
            command = scanCom.next();
            // user input

            if (command.equals("s")) {
                list.SelectionSort(inputs, count);
                list.printArr(inputs, count);
                System.out.println("#Selection-sort comparisons: " + list.getNumComp());
            } else if (command.equals("m")) {
                list.mergeSort(inputs,  count);
                list.printArr(inputs, count);
                System.out.println("#Merge-sort comparisons: " + list.getNumComp());
            } else if (command.equals("h")) {
                list.heapSort(inputs,  count);
                list.printArr(inputs, count);
                System.out.println("#Heap-sort comparisons: " + list.getNumComp());
            } // if


            System.exit(0);

        } catch (FileNotFoundException fnfe) {
            System.out.println("File Not Found");
        } // try
    } // main
} // LinkedListDriver
