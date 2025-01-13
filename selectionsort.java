public class selectionsort {
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            // Swap the smallest element with the first element of the unsorted part
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int[] sortedArr = selectionSort(arr);
        System.out.println("Sorted array:");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }
}
    

