package datastr.a4;
import java.util.*;

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

    /****************************************************************************/

    public void heapSort(int[] arr, int length) {
        numComp = 0;
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        } // for
    } // heapSort

    public void heapify(int arr[], int n, int i)
        {
            int largest = i; // Initialize largest as root
            int l = 2 * i + 1; // left = 2*i + 1
            int r = 2 * i + 2; // right = 2*i + 2

            // If left child is larger than root
            if (l < n && arr[l] > arr[largest]) {
                largest = l;
            } // if
            // If right child is larger than largest so far
            if (r < n && arr[r] > arr[largest]) {
                largest = r;
            } // if

            numComp++;

            // If largest is not root
            if (largest != i) {
                int swap = arr[i];
                arr[i] = arr[largest];
                arr[largest] = swap;

                // Recursively heapify the affected sub-tree
                heapify(arr, n, largest);
            } // if
        } // heapify


/****************************************************************************/

    int partitionFp(int arr[], int low, int high) {
        // First element as pivot
        int pivot = arr[low];
        int st = low; // st points to the starting of array
        int end = high; // end points to the ending of the array
        int k = high;
        //numComp = 0;

        for (int i = high; i > low; i--) {
            numComp++;
            if (arr[i] > pivot)
                swap(arr, i, k--);
        } // for
        swap(arr, low, k);
        // As we got pivot element index is end
        // now pivot element is at its sorted position
        // return pivot element index (end)
        return k;
    } // partitionFp

    public void quickSortImp(int arr[], int low, int high) {

        // If low is lesser than high
        if (low < high) {
            // idx is index of pivot element which is at its
            // sorted position
            int idx = partitionFp(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSortImp(arr, low, idx - 1);
            quickSortImp(arr, idx + 1, high);
        } // if
    } // quickSortImp


/****************************************************************************/


    public void random(int arr[],int low,int high) {
        Random rand= new Random();
        int pivot = rand.nextInt(high-low)+low;

        int temp1=arr[pivot];
        arr[pivot]=arr[high];
        arr[high]=temp1;
    } // random

    public int partition(int arr[], int low, int high) {
        // pivot is chosen randomly
        random(arr,low,high);
        int pivot = arr[high];

        int i = (low-1); // index of smaller element
        for (int j = low; j < high; j++) {
            numComp++;
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } // if
        } // for

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    } // partition

    public void sort(int arr[], int low, int high) {
        //numComp = 0;
        if (low < high) {
            /* pi is partitioning index, arr[pi] is
               now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        } // if
    } // sort

/****************************************************************************/



    public int getNumComp() {
        return numComp;
    } // getNumComp

    public void resetNumComp() {
        numComp = 0;
    } // getNumComp


} // Sorting Class
