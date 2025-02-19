package algos.linearsearch;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key to search in array");

        int input = sc.nextInt();

        int[] a = {1, 2, 3, 4, 5};
        System.out.println("Position of key in array: ");
        System.out.println(linearSearch(a, input));



    }

    public static int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
                   }
        return -1;
    }

}
