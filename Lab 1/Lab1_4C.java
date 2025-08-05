import java.util.Scanner;

public class Lab1_4C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        int low = 0, high = n - 1, pos = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                pos = mid;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (pos != -1)
            System.out.println("Element found at index: " + pos);
        else
            System.out.println("Element not found.");
    }
}

