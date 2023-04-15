package datastr.a4;

public class Sorting {
    private int numComp;

    public Sorting() {
        numComp = 0;
    } // default constructor


    public void SelectionSort(int[] inputs, int length) {
        numComp = 0;
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
                numComp++;
            } else {
                numComp++;
            } // if
        } // for

        return indexOfMin;
    } // minIndex


    public void mergeSort(int[] inputs, int length) {
        if (length < 2) {
            return;
        } // if
        // if only one element

        int mid = length / 2; // midpoint
        int[] left = new int[mid];
        int[] right = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = inputs[i];
        } // for
        for (int i = mid; i < length; i++) {
            right[i - mid] = inputs[i];
        } // for
        // splits into two subarrays

        mergeSort(left, mid);
        mergeSort(right, length - mid);

        merge(inputs, left, right, mid, length - mid);
    } // mergeSort

    public  void merge (int[] inputs, int[] l, int[] r, int left, int right) {

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                inputs[k++] = l[i++];
            } else {
                inputs[k++] = r[j++];
            } // if
            numComp++;
        } // while

        while (i < left) {
            inputs[k++] = l[i++];
//            numComp++;
        } // while

        while (j < right) {
            inputs[k++] = r[j++];
//            numComp++;
        } // while
    } // merge



    public void printArr(int[] arr, int count) {
        for (int i  = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        } // for
        // prints vals of array
        System.out.println();
    } // printArr

    public int getNumComp() {
        return numComp;
    } // getNumComp

    public void resetNumComp() {
        numComp = 0;
    } // getNumComp


} // Sorting Class
