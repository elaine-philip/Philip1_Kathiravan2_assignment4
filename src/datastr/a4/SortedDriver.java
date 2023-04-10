package datastr.a4;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class SortedDriver {
    public static void main(String[] args) {
        try {

            System.out.println("selection-sort (s) merge-sort (m) heap-sort (h) quick-sort-fp (q)");
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
                list.Selection(inputs, count);
                list.printArr(inputs, count);
                System.out.println("#Selection-sort comparisons: ");
            } // if


            System.exit(0);


/**

   while (!command.equals("q")) {
                boolean invalid = false;
                Scanner scanCom  = new Scanner(System.in);
                command = scanCom.next();
                // user input

                if (command.equals("p")) {
                    if (isInt) {
                        listI.inOrder();
                    } else if (isDouble) {
                        listD.inOrder();
                    } else if (isString) {
                        listS.inOrder();
                    } // if
                    // prints list
                } else if (command.equals("i")) {
                    if (isInt) {
                        listI.inOrder();
                        System.out.print("Enter a number to insert: ");
                        scanCom = new Scanner(System.in);
                        int val = scanCom.nextInt();
                        listI.insert(val);
                        listI.inOrder();
                    } else if (isDouble) {
                        listD.inOrder();
                        System.out.print("Enter a number to insert: ");
                        scanCom = new Scanner(System.in);
                        double val = scanCom.nextDouble();
                        listD.insert(val);
                        listD.inOrder();
                    } else if (isString) {
                        listS.inOrder();
                        System.out.print("Enter a string to insert: ");
                        scanCom = new Scanner(System.in);
                        String val = scanCom.next();
                        listS.insert(val);
                        listS.inOrder();
                    } // if
                    // prints in-order tree, inserts item, and prints new tree
                } else if (command.equals("r")) {
                    if (isInt) {
                        listI.inOrder();
                        System.out.print("Enter a number to search: ");
                        scanCom = new Scanner(System.in);
                        int val = scanCom.nextInt();
                        listI.retrieve(val);
                    } else if (isDouble) {
                        listD.inOrder();
                        System.out.print("Enter a number to search: ");
                        scanCom = new Scanner(System.in);
                        double val = scanCom.nextDouble();
                        listD.retrieve(val);
                     } else if (isString) {
                        listS.inOrder();
                        System.out.print("Enter a string to search: ");
                        scanCom = new Scanner(System.in);
                        String val = scanCom.next();
                        listS.retrieve(val);
                     } // if
              } else if (command.equals("c")) {
                    if (isInt) {
                        listI.inOrder();
                        System.out.print("Enter a number: ");
                        scanCom = new Scanner(System.in);
                        int val = scanCom.nextInt();
                        System.out.print(val + " cousins: ");
                        listI.getCousins(val);
                    } else if (isDouble) {
                        listD.inOrder();
                        System.out.print("Enter a number: ");
                        scanCom = new Scanner(System.in);
                        double val = scanCom.nextDouble();
                        System.out.print(val + " cousins: ");
                        listD.getCousins(val);
                    } else if (isString) {
                        listS.inOrder();
                        System.out.print("Enter a string: ");
                        scanCom = new Scanner(System.in);
                        String val = scanCom.next();
                        System.out.print(val + " cousins: ");
                        listS.getCousins(val);
                    } // if
                    // prints original list, deletes item, and prints new list




               } else if (command.equals("q")) {
                    System.out.println("Exiting the program...");
                    System.exit(0);
                } else {
                    invalid = true;
                } // if
                // all command cases

                if (invalid) {
                    System.out.print("Invalid command, try again: ");
                } else if (!command.equals("q")){
                    System.out.print("Enter a command: ");
                } // if
                //prompting user

            } // while
            // loop to prompt user

            */


        } catch (FileNotFoundException fnfe) {
            System.out.println("File Not Found");
        } // try
    } // main
} // LinkedListDriver
