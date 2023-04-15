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
        numComp = 0;
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
        } // while

        while (j < right) {
            inputs[k++] = r[j++];
        } // while
    } // merge

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



} // Sorting Class
