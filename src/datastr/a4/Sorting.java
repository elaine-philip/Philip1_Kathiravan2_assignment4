package datastr.a4;

public class Sorting {
    private int numComp;

    public Sorting() {
        numComp = 0;
    } // default constructor


    public void Selection(int[] inputs, int length) {
        int endIndex = length - 1;
        for (int i = 0; i < endIndex; i++) {
            swap(inputs, i, minIndex(inputs, i, endIndex));
        } // for
    } // Selection Sort Method

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    } // swap

    public int minIndex(int[] values, int start, int end) {
        int indexOfMin = start;

        for (int i = start + 1; i <= end; i++) {
            if (values[i] < values[indexOfMin]) {
                    indexOfMin = i;
            } // if
        } // for

        return indexOfMin;
    } // minIndex


    public void printArr(int[] arr, int count) {
        for (int i  = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        } // for
        // prints vals of array
        System.out.println();
    } // printArr

} // Sorting Class
