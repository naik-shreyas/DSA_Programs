package algos.selectionsort;

public class App {
    public static void main(String[] args) {
        int[] myArray = selectionSort(new int[]{23, 56, 7, 98});
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    public static int[] selectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int minimum = i;
            for (int j = 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    minimum = j;
                }
                int temp = a[i];
                a[j] = a[i];
                a[i] = temp;
            }

        }
        return a;
    }
}
