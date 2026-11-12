// Linear Search in a Sorted Array
public class LinS {

    public static int linS(int arr[], int key) {
        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == key) {
                return i;   
            }

            if(arr[i] > key) {
                return -1; 
            }
        }

        return -1; 
    }

    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50, 60};
        int key = 40;

        int result = linS(a, key);

        if(result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
