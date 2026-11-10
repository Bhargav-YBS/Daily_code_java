// Linear Search for an unsorted array

public class LinS {

    public static int linS(int arr[], int key) {

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == key) {
                return i;   
            }
        }

        return -1;  
    }

    public static void main(String[] args) {

        int[] a = {10, 20, 3, 0, 85, 36};

        int key = 42;

        int result = linS(a, key);

        if(result != -1) {
            System.out.println("Element is in array at index " + result);
        }
        else {
            System.out.println("Element not found in array");
        }
    }
}
