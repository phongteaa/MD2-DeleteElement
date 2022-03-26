import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    static int size, x, index;
    static int[] array;
    static boolean b;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.print("Enter array's size: ");
            size = scanner.nextInt();
            array = new int[size];

            for (int i = 0; i < array.length; i++) {
                System.out.print("Enter element: ");
                array[i] = scanner.nextInt();
            }
            System.out.println("Original array = " + Arrays.toString(array));

            System.out.print("Enter an element to check and delete: ");
            x = scanner.nextInt();
            index = checkElementInArray(array, x);

            if (index != -1) {
                deleteElement(array, index);
            }
        } while (index == -1);

    }

    public static int checkElementInArray(int[] a, int value) {
        boolean check = false;
        int indexx = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                indexx = i;
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println(value + " is in array");
        } else
            System.out.println(value + " is not in array");
        return indexx;
    }

    public static void deleteElement(int[] arr, int ind) {
        int[] newArray = new int[arr.length - 1];
        for (int j = 0; j < ind; j++) {
            newArray[j] = arr[j];
        }
        for (int k = ind + 1; k < arr.length; k++) {
            newArray[k - 1] = arr[k];
        }
        System.out.println("New array after deletion = " + Arrays.toString(newArray));
    }

}
